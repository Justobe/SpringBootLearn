package com.springboot.yanming.mybatisconfig.mapper;

import com.springboot.yanming.mybatisconfig.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: YanMing
 * @Description:
 * @Date: Created in 19:00 2017/11/27
 */
@Mapper
public interface UserMapper {

    List<User> findUserByName(@Param("username")String username);

    void insertUser(User user);
}
