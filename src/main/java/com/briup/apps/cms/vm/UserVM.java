package com.briup.apps.cms.vm;

/**
 * @description: 用户viewmodel类，根据用户名和密码封装为一个角色对象，为了信息交互时直接在一栏里传入两个信息
 * @author: user
 **/

public class UserVM {
    private String username;
    private String password;

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
