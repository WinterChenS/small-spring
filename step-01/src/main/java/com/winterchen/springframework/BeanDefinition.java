package com.winterchen.springframework;

/**
 * @author CENTURY
 * @version 1.0
 * @date 2021/11/25 15:37
 **/
public class BeanDefinition {

    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}