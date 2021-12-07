package com.winterchen.springframework.beans.factory.support;

import com.winterchen.springframework.beans.BeanException;
import com.winterchen.springframework.beans.factory.ConfigurableListableBeanfactory;
import com.winterchen.springframework.beans.factory.factory.BeanDefinition;
import com.winterchen.springframework.beans.factory.factory.ConfigurableBeanFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author CENTURY
 * @version 1.0
 * @date 2021/11/25 15:57
 * @description TODO
 **/
public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory implements  BeanDefinitionRegistry, ConfigurableListableBeanfactory {

    private Map<String, BeanDefinition> beanDefinitionMap = new HashMap<>();


    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName, beanDefinition);
    }

    @Override
    public boolean containsBeanDefinition(String beanName) {
        return beanDefinitionMap.containsKey(beanName);
    }

    @Override
    public <T> Map<String, T> getBeansOfType(Class<T> type) throws BeanException {
        Map<String, T> result = new HashMap<>();
        beanDefinitionMap.forEach((beanName, beanDefinition) -> {
            Class beanClass = beanDefinition.getBeanClass();
            if (type.isAssignableFrom(beanClass)) {
                result.put(beanName, (T) getBean(beanName));
            }
        });
        return result;
    }

    @Override
    public String[] getBeanDefinitionNames() {
        return beanDefinitionMap.keySet().toArray(new String[0]);
    }

    @Override
    public BeanDefinition getBeanDefinition(String beanName) throws BeanException {
        BeanDefinition beanDefinition = beanDefinitionMap.get(beanName);
        if (beanDefinition == null) throw new BeanException("no bean named '" + beanName + "' is defined");
        return beanDefinition;
    }

}