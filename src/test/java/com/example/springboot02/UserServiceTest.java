package com.example.springboot02;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/*
 *@title UserServiceTest
 *@description
 *@author 24844
 *@version 1.0
 *@create 2023/10/17 9:52
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Resource
    private RedisTemplate<String,String> redisTemplate;

    @Test
    public void test() {
        redisTemplate.opsForValue().set("u","u");

        System.out.println(redisTemplate.opsForValue().get("u"));

    }
}