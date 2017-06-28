package com.didispace;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;
/**
 * 配置服务，此配置发布到git上
 * @author shichangjian
 *
 */
@EnableConfigServer
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		new SpringApplicationBuilder(Application.class).web(true).run(args);
	}

	//此注解是application.properties
	//spring.cloud.config.server.git.uri：配置git仓库位置
	//spring.cloud.config.server.git.searchPaths：配置仓库路径下的相对搜索位置，可以配置多个
	//spring.cloud.config.server.git.username：访问git仓库的用户名
	//spring.cloud.config.server.git.password：访问git仓库的用户密码
	
//	didispace.properties
//	didispace-dev.properties
//	didispace-test.properties
//	didispace-prod.properties
//	url会映射{application}-{profile}.properties对应的配置文件，{label}对应git上不同的分支
	
	
//	****************************************
	
	//下面注解是config-client项目,src/main/resources,bootstrap.properties
	//对应上面的config-server
//	spring.application.name=didispace
//	spring.cloud.config.profile=dev
//	spring.cloud.config.label=master
//	spring.cloud.config.uri=http://localhost:7001/
	
//		spring.application.name：对应前config-server配置文件中的{application}部分
//		spring.cloud.config.profile：对应前config-server配置文件中的{profile}部分
//		spring.cloud.config.label：对应前config-server配置文件的git分支
//		spring.cloud.config.uri：配置config-server中心的地址
	
//		这里需要格外注意：上面这些属性必须配置在bootstrap.properties中，config部分内容才能被正确加载。因为config的相关配置会先于application.properties，而bootstrap.properties的加载也是先于application.properties
	
	
}
