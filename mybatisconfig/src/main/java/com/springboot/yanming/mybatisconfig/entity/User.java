package com.springboot.yanming.mybatisconfig.entity;

import java.io.Serializable;

/**
 * @Author: YanMing
 * @Description:
 * @Date: Created in 12:16 2017/11/27
 */
public class User implements Serializable{

    private String id;
    private String username;
    private String password;
    private String sex;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
