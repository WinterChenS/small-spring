package com.winterchen.springframework.beans;

/**
 * @author CENTURY
 * @version 1.0
 * @date 2021/12/2 14:19
 * @description TODO
 **/
public class PropertyValue {

    private final String name;

    private final Object value;

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public String getName() {
        return name;
    }


}