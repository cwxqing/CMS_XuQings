package com.briup.apps.cms.config;

import com.briup.apps.cms.utils.*;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @description: 统一异常处理类
 * @author: user
 **/
@RestControllerAdvice
public class CustomerExceptionHandler {

    @ExceptionHandler(value =  Exception.class) // 捕获 Controller 中抛出的指定类型的异常，也可以指定其他异常
    public <E> Message handler(Exception exception){
        exception.printStackTrace();
        if(exception instanceof CustomerException){
            if(exception instanceof PermissionException){
                return MessageUtil.forbidden("权限不足");
            }
            if( exception instanceof UnAuthorizedException){
                return MessageUtil.unAuthorized(exception.getMessage());
            }
            return MessageUtil.error(exception.getMessage());
        }
        return MessageUtil.error("后台接口异常！");
    }
}
