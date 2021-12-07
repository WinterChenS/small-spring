package com.winterchen.springframework;

import com.winterchen.springframework.bean.UserService;
import junit.framework.TestCase;
import org.junit.Test;

public class ApiTest extends TestCase {


    @Test
    public void testBeanFactory() {
        BeanFactory beanFactory = new BeanFactory();
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }

}