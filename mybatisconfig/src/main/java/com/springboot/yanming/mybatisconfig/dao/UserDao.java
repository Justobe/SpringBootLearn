package com.springboot.yanming.mybatisconfig.dao;

import com.springboot.yanming.mybatisconfig.entity.User;

import java.util.List;

/**
 * @Author: YanMing
 * @Description:
 * @Date: Created in 19:03 2017/11/27
 */
public interface UserDao {

    List<User> findUserByName(String username);

    void insertUser(User user);
}
