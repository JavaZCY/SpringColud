package com.zcy.springcloud.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zcy.springcloud.entities.Dept;

@FeignClient(value = "MICROSERVICECLOUD-DEPT" ,fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {

	/**
	 * 添加数据
	 * @param dept
	 * @return
	 */
	@RequestMapping(value = "/dept/add" , method = RequestMethod.POST)
	public boolean addDept(Dept dept);
	/**
	 * 根据id查询数据/dept/get/1212
	 * @param id  
	 * @return
	 */
	@RequestMapping(value = "/dept/get/{id}" , method = RequestMethod.GET)
	public Dept getById(@PathVariable("id")Long id);
	/**
	 * 查询所有数据
	 * @return
	 */
	@RequestMapping(value = "/dept/list" , method = RequestMethod.GET)
	public List<Dept> getListAll();
}
