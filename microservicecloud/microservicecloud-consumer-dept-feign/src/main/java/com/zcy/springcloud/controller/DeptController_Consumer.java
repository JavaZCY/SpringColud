package com.zcy.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zcy.springcloud.entities.Dept;
import com.zcy.springcloud.service.DeptClientService;

@RestController
public class DeptController_Consumer {
	@Autowired
	private DeptClientService service;
	
	@RequestMapping(value = "/consumer/dept/get/{id}")
	public Dept get(@PathVariable(value = "id")Long id){
		return this.service.getById(id);
	}
	
	@RequestMapping(value = "/consumer/dept/list")
	public List<Dept> list(){
		return this.service.getListAll();
	}
	
	@RequestMapping(value = "/consumer/dept/add")
	public Object add(Dept dept){
		return this.service.addDept(dept);
	}
}
