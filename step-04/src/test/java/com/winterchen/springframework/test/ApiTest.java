package com.winterchen.springframework.test;

import com.winterchen.springframework.beans.PropertyValue;
import com.winterchen.springframework.beans.PropertyValues;
import com.winterchen.springframework.beans.factory.factory.BeanDefinition;
import com.winterchen.springframework.beans.factory.factory.BeanReference;
import com.winterchen.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.winterchen.springframework.test.bean.UserDao;
import com.winterchen.springframework.test.bean.UserService;
import org.junit.Test;

/**
 * @author CENTURY
 * @version 1.0
 * @date 2021/11/25 16:44
 * @description TODO
 **/
public class ApiTest {

    @Test
    public void testBeanFactory() {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        beanFactory.registerBeanDefinition("userDao", new BeanDefinition(UserDao.class));
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("uId", "10001"));
        propertyValues.addPropertyValue(new PropertyValue("userDao", new BeanReference("userDao")));

        BeanDefinition beanDefinition = new BeanDefinition(UserService.class, propertyValues);
        beanFactory.registerBeanDefinition("userService", beanDefinition);
        UserService userServiceSingleton = (UserService) beanFactory.getBean("userService");
        userServiceSingleton.queryUserInfo();
    }

}