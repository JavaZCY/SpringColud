package com.zcy.springcloud.service;

import java.util.List;

import com.zcy.springcloud.entities.Dept;

import feign.hystrix.FallbackFactory;

public class DeptClientServiceFallbackFactory 
		implements FallbackFactory<DeptClientService>{

	@Override
	public DeptClientService create(Throwable arg0) {
		return new DeptClientService() {
			
			@Override
			public List<Dept> getListAll() {
				return null;
			}
			
			@Override
			public Dept getById(Long id) {
				return new Dept().setDeptno(id).setDname("该ID:"+id+"没有向对应的信息，null--@HystrixCommand")
						.setDb_source("no this database in Mysql");
			}
			
			@Override
			public boolean addDept(Dept dept) {
				return false;
			}
		};
	}

}
