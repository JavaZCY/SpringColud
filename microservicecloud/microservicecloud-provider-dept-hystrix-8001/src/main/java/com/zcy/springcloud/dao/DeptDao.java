package com.zcy.springcloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.zcy.springcloud.entities.Dept;

//dao
@Mapper
public interface DeptDao {
	/**
	 * 添加数据
	 * @param dept d
	 * @return boolean
	 */
	public boolean addDept(Dept dept);
	/**
	 * 根据id查询数据
	 * @param id id
	 * @return Dept
	 */
	public Dept findById(Long id);
	/**
	 * 查询所有数据
	 * @return List<Dept>
	 */
	public List<Dept> findAll();
}
