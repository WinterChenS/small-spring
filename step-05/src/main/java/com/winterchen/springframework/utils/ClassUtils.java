package com.winterchen.springframework.utils;

/**
 * @author CENTURY
 * @version 1.0
 * @date 2021/12/2 16:25
 * @description TODO
 **/
public class ClassUtils {

    public static ClassLoader getDefaultClassLoader() {
        ClassLoader cl = null;
        try {
            cl = Thread.currentThread().getContextClassLoader();
        } catch (Throwable ex) {

        }

        if (cl == null) {
            cl = ClassUtils.class.getClassLoader();
        }
        return cl;
    }

}