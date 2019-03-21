package com.mq.mqdemo.models;

import com.mq.mqdemo.enums.ResultCodeEnum;

public class AjaxResult {
    private Object data;
    private String message;
    private String status;

    public AjaxResult(Object object) {
        this.success(object);
    }

    public AjaxResult( String status,String message,Object data) {
        this.data = data;
        this.message = message;
        this.status = status;
    }

    public AjaxResult() {
    }

    public AjaxResult success() {
        this.status = ResultCodeEnum.SUCCESS.getValue();
        this.message = ResultCodeEnum.SUCCESS.getName();
        return this;
    }

    public AjaxResult success(Object data) {
        this.status = ResultCodeEnum.SUCCESS.getValue();
        this.message = ResultCodeEnum.SUCCESS.getName();
        this.data = data;
        return this;
    }

    public AjaxResult failure() {
        this.status = ResultCodeEnum.EXCEPTION.getValue();
        this.message = ResultCodeEnum.EXCEPTION.getName();
        return this;
    }

    public AjaxResult failure(String message) {
        this.status =  ResultCodeEnum.EXCEPTION.getValue();
        this.message = message;
        return this;
    }


    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
