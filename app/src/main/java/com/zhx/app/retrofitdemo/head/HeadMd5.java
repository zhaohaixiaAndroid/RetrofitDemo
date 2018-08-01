package com.zhx.app.retrofitdemo.head;

import com.zhx.app.retrofitdemo.utils.MD5Util;

import java.util.Locale;

/**
 * Created by Administrator on 2018/7/26.
 */

public class HeadMd5 {
    /**
     * md5加密
     *
     * @param objs 参数集
     * @return mdkey
     */
    public static String md5(Object... objs) {
        StringBuilder sb = new StringBuilder();
        for (Object o : objs) {
            sb.append(o);
        }

        return MD5Util.encode(sb.toString()).toLowerCase(Locale.getDefault());
    }
}
