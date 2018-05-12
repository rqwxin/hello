package com.cgx.springboot.hello.webservice.service;

import com.cgx.springboot.hello.webservice.User;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class UserServiceImpl implements  UserService {

    private Map<Long, User> userMap = new HashMap<Long, User>();
     {
        User user = new User();
        user.setUserId(10001L);
        user.setUserName("liyd1");
        user.setEmail("liyd1@qq.com");
        user.setGmtCreate(new Date());
        userMap.put(user.getUserId(), user);
        user = new User();
        user.setUserId(10002L);
        user.setUserName("liyd2");
        user.setEmail("liyd2@qq.com");
        user.setGmtCreate(new Date());
        userMap.put(user.getUserId(), user);
        user = new User();
        user.setUserId(10003L);
        user.setUserName("liyd3");
        user.setEmail("liyd3@qq.com");
        user.setGmtCreate(new Date());
        userMap.put(user.getUserId(), user);
    }
    @Override
    public String getName(Long userId) {
        return "liyd-" + userId;
    }
}
