package com.didispace.web;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.didispace.service.ComputeService;

 
/**
 * 消费compute-service的add服务,通过直接RestTemplate来调用服务，计算10 + 20的值 	
 * @author shichangjian
 *
 */
@RestController
public class ConsumerController {
	
	
//	没有使用断路器
//	   @Autowired
//	    RestTemplate restTemplate;
//	   
//	    @RequestMapping(value = "/add", method = RequestMethod.GET)
//	    public String add() {
//	        return restTemplate.getForEntity("http://COMPUTE-SERVICE/add?a=10&b=20", String.class).getBody();
//	    }
	    
	   
	
//	使用断路器功能
    @Autowired
    private ComputeService computeService;
    
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {
        return computeService.addService();
    }

}