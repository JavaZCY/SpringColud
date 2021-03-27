package com.zcy.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zcy.springcloud.dao.DeptDao;
import com.zcy.springcloud.entities.Dept;
import com.zcy.springcloud.service.DeptService;
@Service
public class DeptServiceImpl implements DeptService {
	
	@Autowired
	private DeptDao dao;

	@Override
	public boolean addDept(Dept dept) {
		return dao.addDept(dept);
	}

	@Override
	public Dept findById(Long id) {
		return dao.findById(id);
	}

	@Override
	public List<Dept> findAll() {
		return dao.findAll();
	}

}
