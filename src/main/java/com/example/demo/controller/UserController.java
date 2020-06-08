package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.server.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api("用户管理")
/*@ResponseBody + @Controller*/
@RestController
@RequestMapping("/user")
public class UserController {

    /*自动导入依赖的bean*/
    @Autowired
    private UserService userService;

    @ApiOperation("获取用户列表")
    @GetMapping("/findAll")
    public List<User> findAll(){
        return userService.findAll();
    }

    @ApiOperation("获取用户")
    @PostMapping("/get")
    public User getUser(int id){
        return userService.getUser(id);
    }

}
