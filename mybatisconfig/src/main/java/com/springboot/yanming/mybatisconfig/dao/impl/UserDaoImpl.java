package com.springboot.yanming.mybatisconfig.dao.impl;

import com.springboot.yanming.mybatisconfig.dao.UserDao;
import com.springboot.yanming.mybatisconfig.entity.User;
import com.springboot.yanming.mybatisconfig.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: YanMing
 * @Description:
 * @Date: Created in 19:04 2017/11/27
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> findUserByName(String username) {
        return userMapper.findUserByName(username);
    }

    @Override
    public void insertUser(User user) {
        userMapper.insertUser(user);
    }
}
