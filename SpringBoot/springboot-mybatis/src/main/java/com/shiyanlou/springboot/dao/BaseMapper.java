package com.shiyanlou.springboot.dao;

import java.util.List;

/**
 * 公共方法
 * @author shenhx
 *
 * @param <T>
 */
public interface BaseMapper<T> {
	
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
	 * 通过ID查找
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
	 * 获取列表数据
	 * @return
	 */
	List<T> list();
}
