package com.didispace.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * 定义compute-service服务的接口
 * @author shichangjian
 *
 */
@FeignClient(value = "compute-service", fallback = ComputeClientHystrix.class)	//@FeignClient("compute-service")注解来绑定该接口对应compute-service服务，fallback属性指定回调类ComputeClientHystrix
public interface ComputeClient {
	
	/**
	 * 通过Spring MVC的注解来配置compute-service服务下的具体实现
	 * @param a
	 * @param b
	 * @return
	 */
    @RequestMapping(method = RequestMethod.GET, value = "/add")
    Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);
}