package com.example.springboot02.service.impl;/*
 *@title UserServiceImpl
 *@description
 *@author 24844
 *@version 1.0
 *@create 2023/9/22 15:31
 */


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.springboot02.entity.User;
import com.example.springboot02.mapper.UserMapper;
import com.example.springboot02.service.UserService;
import icu.mhb.mybatisplus.plugln.base.service.impl.JoinServiceImpl;
import lombok.Setter;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl extends JoinServiceImpl<UserMapper,User> implements UserService {

    @Resource(name = "userMapper")
    @Setter
    private UserMapper userMapper;


    @Override
    @Cacheable(value = "Mycache#3600",key = "#userCode")
    public User getUserByUserCode(String userCode) {
        QueryWrapper<User> user = new QueryWrapper<User>()
                .eq("userCode", userCode)
                .select("userCode","userName","userPassword");
        return this.getOne(user);
    }
}