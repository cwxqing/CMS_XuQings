package com.briup.apps.cms.utils;

/**
 * @description: 自定义的异常类
 * @author: user
 **/

@SuppressWarnings("serial")
public class CustomerException extends RuntimeException {
    public CustomerException() {
    }

    public CustomerException(String message) {
        super(message);
    }

    public CustomerException(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomerException(Throwable cause) {
        super(cause);
    }

    public CustomerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
