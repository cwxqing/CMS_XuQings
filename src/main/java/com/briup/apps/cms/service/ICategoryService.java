package com.briup.apps.cms.service;

import com.briup.apps.cms.bean.Category;
import com.briup.apps.cms.utils.CustomerException;

import java.util.List;

public interface ICategoryService {
	/**
	 * 查找所有分类目录
	 * @return
	 */
    List<Category> findAll();

    /**
         * 新增或更改一个分类目录
     * @param category
     * @throws CustomerException
     */
    void saveOrUpdate(Category category) throws CustomerException;

    /**
     * 根据分类目录的ID删除该目录
     * @param id
     * @throws CustomerException
     */
    void deleteById(long id) throws CustomerException;

    /**
     * 多删除目录，参数为目录的id的数组
     * @param ids
     * @throws CustomerException
     */
    void batchDelete(long[] ids) throws CustomerException;
}
