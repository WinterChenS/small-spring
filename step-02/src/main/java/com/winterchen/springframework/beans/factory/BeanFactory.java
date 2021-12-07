package com.winterchen.springframework.beans.factory;

import com.winterchen.springframework.beans.BeanException;

/**
 * @author CENTURY
 * @version 1.0
 * @date 2021/11/25 15:54
 * @description TODO
 **/
public interface BeanFactory {

    Object getBean(String name) throws BeanException;

}