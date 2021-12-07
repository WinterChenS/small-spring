package com.winterchen.springframework.test.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * @author CENTURY
 * @version 1.0
 * @date 2021/12/2 15:19
 * @description TODO
 **/
public class UserDao {

    private static Map<String, String> map = new HashMap<>();

    static {
        map.put("10001", "winterchen01");
        map.put("10002", "winterchen02");
        map.put("10003", "winterchen03");
    }

    public String queryUserName(String uId) {
        return map.get(uId);
    }

}