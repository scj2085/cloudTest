package com.didispace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
/**
 * 服务消费方
 * @author shichangjian
 *
 */
@SpringBootApplication
@EnableDiscoveryClient//这个类用于帮助与Eureka Server互相协作。- 向Eureka Server注册服务实例.- 向Eureka Server为租约续期.- 当服务关闭期间，向Eureka Server取消租约,- 查询Eureka Server中的服务实例列表,Eureka Client还需要配置一个Eureka Server的URL列表。
@EnableFeignClients//此注解是开启feign功能。Feign是一个声明式的Web Service客户端，它使得编写Web Serivce客户端变得更加简单。我们只需要使用Feign来创建一个接口并用注解来配置它既可完成。它具备可插拔的注解支持，包括Feign注解和JAX-RS注解。Feign也支持可插拔的编码器和解码器。Spring Cloud为Feign增加了对Spring MVC注解的支持，还整合了Ribbon和Eureka来提供均衡负载的HTTP客户端实现
public class FeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignApplication.class, args);
	}

}
