package com.example.springboot02.controller;/*
 *@title UserController
 *@description
 *@author 24844
 *@version 1.0
 *@create 2023/9/22 16:56
 */


import com.example.springboot02.entity.User;
import com.example.springboot02.log.Log;
import com.example.springboot02.service.UserService;
import com.example.springboot02.utils.ResultAjax;
import com.sun.istack.internal.logging.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping(value = "/Login" ,method = RequestMethod.POST)
    @ResponseBody
    public ResultAjax login(@RequestBody User user){

        String token = "token:"+UUID.randomUUID();
        User u = userService.getUserByUserCode(user.getUsername());
        System.out.println(u);
        return ResultAjax.success(token);

    }
}

