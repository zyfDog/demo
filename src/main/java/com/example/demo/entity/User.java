package com.example.demo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("用户")
public class User {

    /*在Swagger model中排序使用position  required带红星*/
    @ApiModelProperty(value = "用户id", required = true, position = 1)
    private String userId;
    @ApiModelProperty(value = "用户姓名", position = 2)
    private String username;
    @ApiModelProperty(value = "用户密码", position = 3)
    private String password;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
