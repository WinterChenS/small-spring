package com.winterchen.springframework.core.io;

/**
 * @author CENTURY
 * @version 1.0
 * @date 2021/12/2 16:41
 * @description TODO
 **/
public interface ResourceLoader {

    String CLASSPATH_URL_PREFIX = "classpath:";

    Resource getResource(String location);

}