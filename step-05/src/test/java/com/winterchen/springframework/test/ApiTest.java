package com.winterchen.springframework.test;

import cn.hutool.core.io.IoUtil;
import com.winterchen.springframework.beans.PropertyValue;
import com.winterchen.springframework.beans.PropertyValues;
import com.winterchen.springframework.beans.factory.factory.BeanDefinition;
import com.winterchen.springframework.beans.factory.factory.BeanReference;
import com.winterchen.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.winterchen.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import com.winterchen.springframework.core.io.DefaultResourceLoader;
import com.winterchen.springframework.core.io.Resource;
import com.winterchen.springframework.test.bean.UserDao;
import com.winterchen.springframework.test.bean.UserService;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author CENTURY
 * @version 1.0
 * @date 2021/11/25 16:44
 * @description TODO
 **/
public class ApiTest {

    private DefaultResourceLoader resourceLoader;

    @Before
    public void init() {
        resourceLoader = new DefaultResourceLoader();
    }

    @Test
    public void testClasspath() throws IOException {
        Resource resource = resourceLoader.getResource("classpath:important.properties");
        InputStream inputStream = resource.getInputStream();
        String content = IoUtil.readUtf8(inputStream);
        System.out.println(content);
    }

    @Test
    public void testFile() throws IOException {
        Resource resource = resourceLoader.getResource("src/test/java/resources/important.properties");
        InputStream inputStream = resource.getInputStream();
        String content = IoUtil.readUtf8(inputStream);
        System.out.println(content);
    }

    @Test
    public void testUrl() throws IOException {
        Resource resource = resourceLoader.getResource("http://localhost:8000/important.properties");
        InputStream inputStream = resource.getInputStream();
        String content = IoUtil.readUtf8(inputStream);
        System.out.println(content);
    }

    @Test
    public void testBeanFactory() {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions("classpath:spring.xml");

        UserService userService = beanFactory.getBean("userService", UserService.class);
        String result = userService.queryUserInfo();
        System.out.println(result);
    }

}