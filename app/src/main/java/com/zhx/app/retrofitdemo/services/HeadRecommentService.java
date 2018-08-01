package com.zhx.app.retrofitdemo.services;

import com.zhx.app.retrofitdemo.beans.Goods;

import retrofit2.Response;
import retrofit2.http.POST;
import rx.Observable;

/**
 * 创建一个接口作为http请求的api接口
 * Created by Administrator on 2018/7/31.
 */

public interface HeadRecommentService {
    @POST("app/index.php?m=Home&c=Category&a=getRecommendGoodsList")
    Observable<Response<Goods>> getgoods();
}
