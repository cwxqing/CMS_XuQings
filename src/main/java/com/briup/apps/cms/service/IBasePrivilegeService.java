package com.briup.apps.cms.service;

import com.briup.apps.cms.bean.BasePrivilege;
import com.briup.apps.cms.utils.CustomerException;
import com.briup.apps.cms.vm.PrivilegeTree;

import java.util.List;

public interface IBasePrivilegeService {
    
    /** 
     * @Description: 查询所有权限 
     * @Param: [] 
     * @Author: user 
     */ 
    List<BasePrivilege> findAll();
    
    /** 
     * @Description: 通过parentId查询权限
     * @Param: [parentId] 
     * @Author: user 
     */ 
    List<BasePrivilege> findByParentId(Long parentId);
    
    /** 
     * @Description: 保存或更新权限 
     * @Param: [privilege] 
     * @return: void 
     * @Author: user 
     */ 
    void saveOrUpdate(BasePrivilege privilege) throws CustomerException;

    /** 
     * @Description: 查询权限树 
     * @Param: [] 
     * @Author: user 
     */ 
    List<PrivilegeTree> findPrivilegeTree();
    
    /** 
     * @Description: 查询用户所有权限 
     * @Param: [id] 
     * @Author: user 
     */ 
    List<BasePrivilege> findByUserId(long id);

}
