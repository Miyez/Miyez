package com.example.springboot02.mapper;/*
 *@title UserMapper
 *@description
 *@author 24844
 *@version 1.0
 *@create 2023/9/22 15:29
 */

import icu.mhb.mybatisplus.plugln.base.mapper.JoinBaseMapper;
import org.springframework.stereotype.Repository;


import com.example.springboot02.entity.User;
@Repository("userMapper")
public interface UserMapper extends JoinBaseMapper<User> {
    public User getUserByUserCode(String userCode);
}
