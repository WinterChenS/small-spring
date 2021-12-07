package com.winterchen.springframework.beans.factory.factory;

/**
 * @author CENTURY
 * @version 1.0
 * @date 2021/11/25 15:54
 * @description TODO
 **/
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);
}