package com.winterchen.springframework.beans.factory.support;

import com.winterchen.springframework.beans.factory.factory.BeanDefinition;

/**
 * @author CENTURY
 * @version 1.0
 * @date 2021/11/25 15:57
 * @description TODO
 **/
public interface BeanDefinitionRegistry {

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

    boolean containsBeanDefinition(String beanName);

}