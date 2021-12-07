package com.winterchen.springframework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author CENTURY
 * @version 1.0
 * @date 2021/11/25 15:38
 * @description bean 工厂类
 **/
public class BeanFactory {

    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    public Object getBean(String name) {
        return beanDefinitionMap.get(name).getBean();
    }


    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(name, beanDefinition);
    }

}