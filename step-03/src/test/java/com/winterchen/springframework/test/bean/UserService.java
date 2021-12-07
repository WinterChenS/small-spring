package com.winterchen.springframework.test.bean;

/**
 * @author CENTURY
 * @version 1.0
 * @date 2021/11/25 16:43
 * @description TODO
 **/
public class UserService {

    private String name;

    public UserService(String name) {
        this.name = name;
    }

    public void queryUserInfo() {
        System.out.println("查询用户信息" + name);
    }

    @Override
    public String toString() {
        return "UserService{" +
                "name='" + name + '\'' +
                '}';
    }
}