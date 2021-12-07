package com.winterchen.springframework.beans.factory.support;

import com.winterchen.springframework.beans.BeanException;
import com.winterchen.springframework.beans.factory.factory.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @author CENTURY
 * @version 1.0
 * @date 2021/12/1 16:11
 * @description 实例化策略接口
 **/
public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeanException;

}