package com.briup.apps.cms.service;

import com.briup.apps.cms.bean.BaseUser;
import com.briup.apps.cms.bean.extend.BaseUserExtend;
import com.briup.apps.cms.utils.CustomerException;
import com.briup.apps.cms.vm.UserVM;

import java.util.List;

/**
 * @description: 用户接口
 * @author: user
 **/

public interface IBaseUserService {
    
    /** 
     * @Description: 登录
     * @Param: [userVM] 
     * @return: void 
     * @Author: user 
     */
    BaseUser login(UserVM userVM) throws CustomerException;
    
    /**
     * @Description: 通过id查询
     * @Param: [id]
     * @return: com.briup.apps.cms.bean.extend.BaseUserExtend
     * @Author: user
     */
    BaseUserExtend findById(long id);

    /**
     * @Description: 查询所有
     * @Param: []
     * @return: java.util.List<com.briup.apps.cms.bean.BaseUser>
     * @Author: user
     */
    List<BaseUser> findAll();
    
    /** 
     * @Description: 级联查询所有
     * @Param: [] 
     * @return: java.util.List<com.briup.apps.cms.bean.extend.BaseUserExtend> 
     * @Author: user 
     */ 
    List<BaseUserExtend> cascadeRoleFindAll();

    /**
     * @Description:  保存或更新
     * @Param: [baseUser]
     * @return: void
     * @Author: user
     */
    void saveOrUpdate(BaseUser baseUser) throws CustomerException;

    /** 
     * @Description: 更新状态
     * @Param: [status] 
     * @return: void 
     * @Author: user 
     */ 
    void changeStatus(long id,String status) throws CustomerException;
    
    /** 
     * @Description: 通过id删除
     * @Param: [id] 
     * @return: void 
     * @Author: user 
     */ 
    void deleteById(long id) throws CustomerException;
    
    /** 
     * @Description: 设置角色
     * @Param: [id, roles] 
     * @return: void 
     * @Author: user 
     */ 
    void setRoles(long id, List<Long> roles);
}
