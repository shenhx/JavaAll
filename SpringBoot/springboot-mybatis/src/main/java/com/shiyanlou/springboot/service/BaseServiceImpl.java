package com.shiyanlou.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.shiyanlou.springboot.dao.BaseMapper;

@Transactional(rollbackFor = Exception.class)
public class BaseServiceImpl<T> implements IBaseService<T> {

	@Autowired
	protected BaseMapper<T> baseMapper;
	
	@Override
	public Integer save(T t) {
		// TODO Auto-generated method stub
		return baseMapper.save(t);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		baseMapper.delete(id);
	}

	@Override
	public T findById(Integer id) {
		// TODO Auto-generated method stub
		return baseMapper.findById(id);
	}

	@Override
	public void update(T t) {
		// TODO Auto-generated method stub
		baseMapper.update(t);
	}

	@Override
	public List<T> list() {
		// TODO Auto-generated method stub
		return baseMapper.list();
	}

}
