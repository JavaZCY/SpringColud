package com.zcy.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zcy.springcloud.entities.Dept;
import com.zcy.springcloud.service.DeptService;

@RestController
public class DeptController {
	@Autowired
	private DeptService service;
	
	@Autowired
	private DiscoveryClient client;
	
	@RequestMapping(value="/dept/add",method = RequestMethod.POST)
	public boolean add(@RequestBody Dept dept){
		return service.addDept(dept);
	}
	
	@RequestMapping(value="/dept/get/{id}",method = RequestMethod.GET)
	public Dept get(@PathVariable("id") Long id){
		return service.findById(id);
	}
	
	@RequestMapping(value="/dept/list",method = RequestMethod.GET)
	public List<Dept> list(){
		return service.findAll();
	}
	
	@RequestMapping(value = "/dept/discovery" , method = RequestMethod.GET)
	public Object disscovery(){
		List<String> list = client.getServices();
		System.out.print("获取到的所有服务：" + list);
		List<ServiceInstance> instances = client.getInstances("microservicecloud-dept");
		for (ServiceInstance ele : instances) {
			System.out.print(ele.getServiceId() + "\t" + ele.getHost() 
			+ "\t" + ele.getHost() + "\t" + ele.getPort() + "\t" + ele.getUri());
		}
		return this.client;
	}
}
