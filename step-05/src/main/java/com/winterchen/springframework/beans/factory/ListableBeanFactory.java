package com.winterchen.springframework.beans.factory;

import com.winterchen.springframework.beans.BeanException;

import java.util.Map;

/**
 * @author CENTURY
 * @version 1.0
 * @date 2021/12/6 10:24
 * @description TODO
 **/
public interface ListableBeanFactory extends BeanFactory {

    /**
     * 按照类型返回Bean实例
     * @param type
     * @param <T>
     * @return
     * @throws BeanException
     */
    <T> Map<String, T> getBeansOfType(Class<T> type) throws BeanException;

    /**
     * 返回注册表中所有的bean名称
     * @return
     */
    String[] getBeanDefinitionNames();

}