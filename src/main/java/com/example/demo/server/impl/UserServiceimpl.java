package com.example.demo.server.impl;

import com.example.demo.dao.mapper.UserMapper;
import com.example.demo.entity.User;
import com.example.demo.server.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceimpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public User getUser(int id) {
        return userMapper.getUserById(id);
    }

}
