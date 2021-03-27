package com.zcy.springcloud.entities;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

//@AllArgsConstructor//全参构造函数
@NoArgsConstructor //无参构造
@Data//set和get方法
@Accessors(chain=true)
public class Dept implements Serializable {

	/**
	 * .
	 */
	private static final long serialVersionUID = -6796627603984040727L;

	/**
	 * 主键.
	 */
	private Long deptno;
	/**
	 * 部门名称.
	 */
	private String dname;
	/**
	 * 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库.
	 */
	private String db_source;
	
	public Dept(Long deptno, String dname, String db_source) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.db_source = db_source;
	}
	
}
