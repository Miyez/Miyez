package com.example.springboot02.mapper;/*
 *@title SysLogMapper
 *@description
 *@author 24844
 *@version 1.0
 *@create 2023/10/16 15:39
 */

import com.example.springboot02.entity.SysLog;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

@Repository
public interface SysLogMapper {

    //保存信息到日志表

    @Insert("insert into test1.sys_log(USERNAME,OPERATION,TIME,METHOD,PARAMS,IP) " +
            "values(#{username},#{operation},#{time},#{method},#{params},#{ip})")
    public void saveSysLog(SysLog syslog) ;
}
