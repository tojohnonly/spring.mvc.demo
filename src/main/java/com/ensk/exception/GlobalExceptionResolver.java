package com.ensk.exception;

import com.ensk.util.ApiCode;
import com.ensk.util.ApiResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionResolver {

    @ResponseBody
    @ExceptionHandler(Exception.class)
    public ApiResult handleException(Exception e) {
        // 打印异常堆栈信息
        // LOG.error(e.getMessage(), e);
        return ApiResult.ofErrorMsg(e.getMessage());
    }

    @ResponseBody
    @ExceptionHandler(BusinessException.class)
    public ApiResult handleBusinessException(BusinessException e) {
        // 不打印异常堆栈信息
        // LOG.error(e.getMsg());
        return ApiResult.ofErrorMsg(e.getMessage());
    }
}