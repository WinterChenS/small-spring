package com.winterchen.springframework.beans.factory.factory;

import com.winterchen.springframework.beans.factory.HierarchicalBeanFactory;

/**
 * @author CENTURY
 * @version 1.0
 * @date 2021/12/6 10:26
 * @description TODO
 **/
public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingletonBeanRegistry {

    String SCOPE_SINGlETON = "singleton";

    String SCOPE_PROTOTYPE = "prototype";

}