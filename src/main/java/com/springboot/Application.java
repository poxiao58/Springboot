package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * springboot �����ļ�
 * ע�⣺��������Ҫ���ڸ����£�Ҳ�������е�controller���������Ӱ���
 * �����磺Application����com.springboot�£���ôcontroller�������com.springboot����com.springboot.xx���£�
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
