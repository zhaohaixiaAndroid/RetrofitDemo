package com.zhx.app.retrofitdemo.services;

import com.zhx.app.retrofitdemo.beans.GoodsEntry;

import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Administrator on 2018/7/26.
 */

public interface ReconmentService {

    @POST("app/index.php?m=Home&c=Category&a=getRecommendGoodsList")
    Observable<GoodsEntry> getData(@Query("partner") String partner,
                                   @Query("version") String version,
                                   @Query("key") String key,
                                   @Query("timestamp")String timestamp,
                                   @Query("start") String start,
                                   @Query("count") String count,
                                   @Query("type") String type ,
                                   @Query("mdkey") String mdkey);


}
