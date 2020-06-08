package com.example.demo.dao.mapper;

import com.example.demo.entity.User;

import java.util.List;

/*@Mapper使用@Mapper将NewsDAO接口交给Spring进行管理或者在启动类使用@MapperScan*/
public interface UserMapper {

    List<User> findAll();
}
