package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * springboot 配置文件
 * 注意：这个类必须要放在根包下，也就是所有的controller必须在其子包下
 * （例如：Application放在com.springboot下，那么controller必须放在com.springboot或者com.springboot.xx包下）
 * @author lijun
 *
 */
//@RestController
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
