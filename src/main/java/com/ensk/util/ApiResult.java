package com.ensk.util;

public class ApiResult<T> {

    private Integer code;

    private String msg;

    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ApiResult(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ApiResult(ApiCode apiCode) {
        this.code = apiCode.getCode();
        this.msg = apiCode.getMsg();
    }

    public static <T> ApiResult<T> of(Integer code, String msg, T data) {
        return new ApiResult(code, msg, data);
    }

    public static ApiResult ofSuccess() {
        return ofSuccess(null);
    }

    public static <T> ApiResult<T> ofSuccess(T data) {
        return ofCode(ApiCode.SUCCESS, data);
    }

    public static <T> ApiResult<T> ofCode(ApiCode apiCode) {
        return ofCode(apiCode, null);
    }

    public static <T> ApiResult<T> ofCode(ApiCode apiCode, T data) {
        return of(apiCode.getCode(), apiCode.getMsg(), data);
    }

    public static ApiResult ofSuccessMsg(String msg) {
        return of(ApiCode.SUCCESS.getCode(), msg, null);
    }

    public static ApiResult ofErrorMsg(String msg) {
        return of(ApiCode.ERROR.getCode(), msg, null);
    }
}