package com.shiyanlou.springboot.service;

import java.util.List;

public interface IBaseService<T> {
	
	/**
	 * 保存
	 * @param t
	 * @return
	 */
	Integer save(T t);
	
	/**
	 * 删除
	 * @param id
	 */
	void delete(Integer id);
	
	
	/**
	 * 通过id查找
	 * @param id
	 * @return
	 */
	T findById(Integer id);
	
	/**
	 * 更新
	 * @param t
	 */
	void update(T t);
	
	/**
	 * 获取所有记录
	 * @return
	 */
	List<T> list();
	
}
