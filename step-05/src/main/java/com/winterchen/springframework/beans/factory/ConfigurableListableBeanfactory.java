package com.winterchen.springframework.beans.factory;

import com.winterchen.springframework.beans.BeanException;
import com.winterchen.springframework.beans.factory.factory.AutowireCapableBeanFactory;
import com.winterchen.springframework.beans.factory.factory.BeanDefinition;
import com.winterchen.springframework.beans.factory.factory.ConfigurableBeanFactory;

/**
 * @author CENTURY
 * @version 1.0
 * @date 2021/12/6 10:25
 * @description TODO
 **/
public interface ConfigurableListableBeanfactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName) throws BeanException;

}