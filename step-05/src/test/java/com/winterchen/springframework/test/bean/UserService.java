package com.winterchen.springframework.test.bean;

/**
 * @author CENTURY
 * @version 1.0
 * @date 2021/11/25 16:43
 * @description TODO
 **/
public class UserService {

    private String uId;

    private UserDao userDao;


    public String queryUserInfo() {
        return userDao.queryUserName(uId);
    }


    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public String toString() {
        return "UserService{" +
                "name='" + uId + '\'' +
                '}';
    }
}