package com.winterchen.springframework.beans;

/**
 * @author CENTURY
 * @version 1.0
 * @date 2021/11/25 15:53
 * @description TODO
 **/
public class BeanException extends RuntimeException {

    public BeanException() {
    }

    public BeanException(String message) {
        super(message);
    }

    public BeanException(String message, Throwable cause) {
        super(message, cause);
    }

    public BeanException(Throwable cause) {
        super(cause);
    }

    public BeanException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}