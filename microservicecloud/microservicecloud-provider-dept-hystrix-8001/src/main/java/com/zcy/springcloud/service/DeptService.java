package com.zcy.springcloud.service;

import java.util.List;

import com.zcy.springcloud.entities.Dept;

public interface DeptService {
	/**
	 * 添加数据
	 * @param dept
	 * @return
	 */
	public boolean addDept(Dept dept);
	/**
	 * 根据id查询数据
	 * @param id
	 * @return
	 */
	public Dept findById(Long id);
	/**
	 * 查询所有数据
	 * @return
	 */
	public List<Dept> findAll();
}
