package com.briup.apps.cms.web.controller;

import com.briup.apps.cms.bean.BasePrivilege;
import com.briup.apps.cms.service.IBasePrivilegeService;
import com.briup.apps.cms.utils.Message;
import com.briup.apps.cms.utils.MessageUtil;
import com.briup.apps.cms.vm.PrivilegeTree;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description: 权限控制器
 * @author: user
 **/
@Validated
@RestController
@RequestMapping("/privilege")
@Api(tags = "权限控制相关接口")
public class PrivilegeController {

    @Autowired
    private IBasePrivilegeService basePrivilegeService;

    @ApiOperation(value = "查询所有权限")
    @GetMapping(value = "findAll")
    public Message findAll(){
        List<BasePrivilege> list = basePrivilegeService.findAll();
        return MessageUtil.success(list);
    }



    @ApiOperation(value = "通过parentId查询")
    @GetMapping(value = "findByParentId")
    public Message findByParentId(Long id){
        List<BasePrivilege> list = basePrivilegeService.findByParentId(id);
        return MessageUtil.success(list);
    }

    @ApiOperation(value ="保存或更新权限")
    @PostMapping(value = "saveOrUpdate")
    public Message saveOrUpdate(BasePrivilege privilege){
        basePrivilegeService.saveOrUpdate(privilege);
        return MessageUtil.success("更新成功");
    }

    @ApiOperation(value = "查询权限，树型结果")
    @GetMapping(value = "findPrivilegeTree")
    public Message findPrivilegeTree(){
        List<PrivilegeTree> list = basePrivilegeService.findPrivilegeTree();
        return MessageUtil.success(list);
    }



}
