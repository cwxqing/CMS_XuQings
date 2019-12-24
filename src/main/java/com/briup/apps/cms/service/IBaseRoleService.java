package com.briup.apps.cms.service;

import com.briup.apps.cms.bean.BaseRole;
import com.briup.apps.cms.bean.extend.BaseRoleExtend;
import com.briup.apps.cms.utils.CustomerException;

import java.util.List;

public interface IBaseRoleService {
    
    /** 
     * @Description: 授权 
     * @Param: [roleId, privilegeIds] 
     * @return: void 
     * @Author: user 
     */ 
    void authorization(long roleId,List<Long> privilegeIds);
    
    /** 
     * @Description: 查询所有角色 
     * @Param: [] 
     * @return: java.util.List<com.briup.apps.cms.bean.BaseRole> 
     * @Author: user 
     */ 
    List<BaseRole> findAll();
    
    /** 
     * @Description: 查询角色级联权限
     * @Param: [] 
     * @return: java.util.List<com.briup.apps.cms.bean.extend.BaseRoleExtend> 
     * @Author: user 
     */ 
    List<BaseRoleExtend> cascadePrivilegeFindAll();
    
    /** 
     * @Description: 保存或更新角色信息 
     * @Param: [baseRole] 
     * @return: void 
     * @Author: user 
     */ 
    void saveOrUpdate(BaseRole baseRole) throws CustomerException;
    
    /** 
     * @Description: 通过id删除角色信息 
     * @Param: [id] 
     * @return: void 
     * @Author: user 
     */ 
    void deleteById(long id) throws CustomerException;
}
