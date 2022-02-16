package com.example.demo.service.impl;

import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServicelmpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public int getAgeByUsername(String username) {
        return userMapper.getAgeByUsername(username);
    }
}