package com.example.demo.server;

import com.example.demo.entity.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User getUser(int id);
}
