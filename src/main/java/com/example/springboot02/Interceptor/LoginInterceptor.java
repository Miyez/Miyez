package com.example.springboot02.Interceptor;/*
 *@title LoginInterceptor
 *@description
 *@author 24844
 *@version 1.0
 *@create 2023/10/17 14:54
 */

import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class LoginInterceptor implements HandlerInterceptor {
    //preHandle是请求执行前执行的

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest,
                             HttpServletResponse httpServletResponse, Object o) throws Exception {
        System.out.println("进入preHandle");
        return true;
    }
    //postHandler是请求结束执行的 当preHandle返回true才会执行


    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView){
        System.out.println("进入postHandle");
    }
    //afterCompletion是视图渲染完成后才执行
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex){
        System.out.println("进入afterCompletion");
    }
}
