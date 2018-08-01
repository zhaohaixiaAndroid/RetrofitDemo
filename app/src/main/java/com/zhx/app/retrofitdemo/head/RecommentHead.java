package com.zhx.app.retrofitdemo.head;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2018/7/26.
 */

public class RecommentHead {

    Constants constants=new Constants();

    public  Map<String, String> getRecomment(String type, String start, String count) {
        Map<String, String> params = new HashMap<>();
        params.put("timestamp", System.currentTimeMillis() + "");
        params.put("count", String.valueOf(count));
        params.put("start", String.valueOf(start));
        params.put("type", type);
        params.put("partner",constants.PARTNER);
        params.put("key", constants.KEY);
        params.put("version", constants.VERSION);
        String mdkey = HeadMd5.md5(constants.PARTNER,type);
        params.put("mdkey",mdkey);
        return params;
    }
}
