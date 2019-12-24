package com.briup.apps.cms.utils;

import com.briup.apps.cms.utils.CustomerException;

/**
 * @description: 权限异常
 * @author: user
 **/
@SuppressWarnings("serial")
public class PermissionException extends CustomerException {
    public PermissionException() {
    }

    public PermissionException(String message) {
        super(message);
    }

    public PermissionException(String message, Throwable cause) {
        super(message, cause);
    }

    public PermissionException(Throwable cause) {
        super(cause);
    }

    public PermissionException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
