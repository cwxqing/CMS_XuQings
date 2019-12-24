package com.briup.apps.cms.vm;

import java.util.List;

/**
 * @description: 用户角色，根据id和角色封装为一个对象
 * @author: user
 **/

public class UserRoleVM {
    private Long id;
    private List<Long> roles;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Long> getRoles() {
        return roles;
    }

    public void setRoles(List<Long> roles) {
        this.roles = roles;
    }
}
