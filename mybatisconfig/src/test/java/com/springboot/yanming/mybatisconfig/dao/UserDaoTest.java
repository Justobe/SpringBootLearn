package com.springboot.yanming.mybatisconfig.dao;

import com.springboot.yanming.mybatisconfig.MybatisconfigApplication;
import com.springboot.yanming.mybatisconfig.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author: YanMing
 * @Description:
 * @Date: Created in 19:06 2017/11/27
 */
@RunWith(SpringJUnit4ClassRunner.class)
//@WebAppConfiguration
@SpringBootTest(classes = MybatisconfigApplication.class)
@SpringBootConfiguration
public class UserDaoTest {
    @Autowired
    UserDao userDao;

    @Test
    public void testUserDao(){

        List<User> users = userDao.findUserByName("yanming");
        System.out.println(users.size()+" user named yanming");

    }
}