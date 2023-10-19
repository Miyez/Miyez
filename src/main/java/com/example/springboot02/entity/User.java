package com.example.springboot02.entity;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName(value = "smbms_user")
public class User implements Serializable {
    private Long id;

    private String userCode;

    private String userName;

    private String username;

    private String userPassword;

    private String password;

    private int gender;

    private String birthday;

    private String phone;

    private String address;

    private int userRole;

    private Long createdBy;

    private String creationDate;

    private Long modifyBy;

    private String modifyDate;

    public String getUsername(){
        return username;
    }

}
