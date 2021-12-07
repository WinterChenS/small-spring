package com.winterchen.springframework.beans.factory.factory;

/**
 * @author CENTURY
 * @version 1.0
 * @date 2021/12/2 14:44
 * @description Bean的引用
 **/
public class BeanReference {

    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }
}