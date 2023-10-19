package com.example.springboot02.service;/*
 *@title UserService
 *@description
 *@author 24844
 *@version 1.0
 *@create 2023/9/22 15:30
 */


import com.example.springboot02.entity.User;
import icu.mhb.mybatisplus.plugln.base.service.JoinIService;

public interface UserService extends JoinIService<User> {
    public User getUserByUserCode(String userCode);

}
