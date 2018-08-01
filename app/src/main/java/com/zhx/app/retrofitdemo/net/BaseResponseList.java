package com.zhx.app.retrofitdemo.net;

import java.util.List;

/**
 * Created by Administrator on 2018/7/30.
 */

public class BaseResponseList<T>{
    private String code;
    private String msg;
    private List<T> data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
