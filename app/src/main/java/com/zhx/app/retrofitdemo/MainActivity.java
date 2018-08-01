package com.zhx.app.retrofitdemo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.zhx.app.retrofitdemo.beans.GoodsEntry;
import com.zhx.app.retrofitdemo.head.Constants;
import com.zhx.app.retrofitdemo.head.HeadMd5;
import com.zhx.app.retrofitdemo.net.BaseSubscriber;
import com.zhx.app.retrofitdemo.net.ExceptionHandle;
import com.zhx.app.retrofitdemo.net.RetrofitClient;
import com.zhx.app.retrofitdemo.services.CallInterface;
import com.zhx.app.retrofitdemo.services.ReconmentService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * retrofit请求网络的流程
 * 1.通过解析网络请求接口的注解  配置网络请求参数
 * 2.通过动态代理 生成网络请求对象
 * 3.通过网络请求适配器 将网络请求进行平台适配
 * 4.通过网络请求执行器 发送网络请求
 * 5.通过数据转换器解析数据返回的数据
 * 6.通过回调执行器 切换线程（子线程>>>主线程
 * ------------------*********************---------
 * 1)网络请求执行器  就是我们创建出来的Call对象，他的作用是创建http请求，而retrofit中默认使用的就是okhttp中的Call
 * 2)网络请求适配器   是Call创建的适配器对象，因为retrofit要适用各种平台，Android、java8、RxJava、Gualva，
 *                 所以retrofit中内置了4中适配器 CallAdapterFactory、ExecutorCallAdapterFactory（Android）、
 *                 Java8CallAdapterFactory、RxJavaCallAdapterFactory，通过这些适配器适用各种平台
 * 3)数据转换器   服务器返回的数据各种各样，retrofit封装了各种数据类型的转化器，将返回的数据转换成我们需要的数据
 * 4）回调执行器  主要作用是切换线程，把子线程转换成主线程  将okhttp的请求结果通过CallBackExecutor使用handler回调到主线程
 */

public class MainActivity extends Activity implements View.OnClickListener {

    private static final String HOTRECOMENT = "hot";
    private static final String TAG = "mainactivity";
    private String start = "1";
    private String count = "20";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        findViewById(R.id.tv_ceshipost).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            //post测试
            case R.id.tv_ceshipost:
                observable();

               // callHttps();


                break;
        }
    }



    private void callHttps() {
        Constants constants = new Constants();
        CallInterface callInterface = RetrofitClient.getInstance(this, constants.BASE_URL).create(CallInterface.class);

        String timeStemp = System.currentTimeMillis() + "";
        String mdkey = HeadMd5.md5(constants.PARTNER, HOTRECOMENT);
        Call<GoodsEntry> responseCall = callInterface.getData(constants.PARTNER,
                constants.VERSION, constants.KEY, timeStemp, start, count, HOTRECOMENT, mdkey);
        responseCall.enqueue(new Callback<GoodsEntry>() {
            @Override
            public void onResponse(Call<GoodsEntry> call, Response<GoodsEntry> response) {

                List<GoodsEntry.DataBean> list = response.body().getData();

                for (int i = 0; i < list.size(); i++) {
                    GoodsEntry.DataBean dataBean=list.get(i);
                    Log.d(TAG, "onResponse: "+dataBean.toString());
                }
            }

            @Override
            public void onFailure(Call<GoodsEntry> call, Throwable t) {

            }
        });
    }

    private void observable() {
        //retrofit使用的步骤：1.创建一个接口作为http请求的api接口
        //2.创建一个retrofit的实例  3.调用api接口

        ReconmentService reconmentService = RetrofitClient.getInstance(this,
                "https://www.aicungou.com/")
                .create(ReconmentService.class);
        Constants constants = new Constants();
        String timeStemp = System.currentTimeMillis() + "";
        String mdkey = HeadMd5.md5(constants.PARTNER, HOTRECOMENT);

        RetrofitClient.getInstance(MainActivity.this, "https://www.aicungou.com/").execute(reconmentService.getData(constants.PARTNER,
                constants.VERSION, constants.KEY, timeStemp, start, count, HOTRECOMENT, mdkey),
                new BaseSubscriber<GoodsEntry>(this) {

                    @Override
                    public void onError(ExceptionHandle.ResponeThrowable e) {
                        Log.d(TAG, "onError: " + e.getMessage().toString().trim());
                    }

                    @Override
                    public void onNext(GoodsEntry goodsBaseResponse) {
                        Log.d(TAG, "onNext: " + goodsBaseResponse.getData().toString());
                        List<GoodsEntry.DataBean> dataBeanList = goodsBaseResponse.getData();
                        for (int i = 0; i < dataBeanList.size(); i++) {
                            GoodsEntry.DataBean dataBean = dataBeanList.get(i);
                            Log.d(TAG, "onNext: " + dataBean.toString());
                        }
                    }

                });
    }
}
