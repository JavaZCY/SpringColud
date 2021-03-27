package com.zcy.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

@Configuration
public class ConfigBean {//boot -->spring applicationContext.xml==@Configuration配置
	@Bean
	@LoadBalanced //设置负载均衡 默认使用轮询算法
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}
	
	@Bean
	public IRule myRule(){
		return new RandomRule();//达到目的 ，用我们重新选择的随机算法替代默认的轮询
	}
	
}

/*@Bean
public Userserive getUserserive(){
	return new UserseriveImpl();
}*/

/*等同于上面<bean id="userserive" class="com.**.**.**.UserseriveImpl"/>*/