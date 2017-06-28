package com.didispace;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 * 服务注册中心
 * 在默认设置下，该服务注册中心也会将自己作为客户端来尝试注册它自己，所以我们需要禁用它的客户端注册行为
 * 只需要在application.properties中问增加如下配置：
	eureka.client.register-with-eureka=false
	eureka.client.fetch-registry=false
 * @author shichangjian
 *
 */
@EnableEurekaServer		//@EnableEurekaServer注解启动一个服务注册中心提供给其他应用进行对话
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		new SpringApplicationBuilder(Application.class).web(true).run(args);
	}

}
