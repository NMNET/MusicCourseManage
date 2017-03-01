package com.nmnet.netbean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by NMNET on 2017/3/1 0001.
 */

@Component
@Scope(value = "prototype")
public class NetResponse {
    public static final String SUCCESS = "success";
    public static final String EXCEPTION = "exception";
    public static final String FAILED = "failed";

    private String code;
    private String msg;
    private Object object;

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

    public Object getObject() {
        return object;
    }

    public void setObject(String msg) {
        setObject(msg, null);
    }

    public void setObject(Object object) {
        setObject("成功", object);
    }

    public void setObject(String msg, Object object) {
        code = SUCCESS;
        this.msg = msg;
        this.object = object;
    }

    public void setFailObject(String msg) {
        setFailObject(msg, null);
    }

    public void setFailObject(String msg, Object object) {
        code = FAILED;
        this.msg = msg;
        this.object = object;
    }


    @Override
    public String toString() {
        return "NetResponse{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", object=" + object +
                '}';
    }
}
