package com.winterchen.springframework.beans.factory.support;

import com.winterchen.springframework.beans.BeanException;
import com.winterchen.springframework.core.io.Resource;
import com.winterchen.springframework.core.io.ResourceLoader;

/**
 * @author CENTURY
 * @version 1.0
 * @date 2021/12/2 16:47
 * @description TODO
 **/
public interface BeanDefinitionReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeanException;

    void loadBeanDefinitions(Resource... resources) throws BeanException;

    void loadBeanDefinitions(String location) throws BeanException;

}