package com.winterchen.springframework.test;

import com.winterchen.springframework.beans.factory.factory.BeanDefinition;
import com.winterchen.springframework.beans.factory.support.DefaultListableBeanFactory;
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
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);
        UserService userServiceSingleton = (UserService) beanFactory.getBean("userService", "winterchen");
        userServiceSingleton.queryUserInfo();
    }

}