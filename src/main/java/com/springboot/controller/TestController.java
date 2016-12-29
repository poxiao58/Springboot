package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * Springboot测试类
 * 使用说明：启动Application类中的main方法之后
 * 		      在浏览器中输入http://localhost:8080
 * 		     即可得到test SpringbootController!
 * @author lijun
 *
 */
@Controller
public class TestController {
	   @RequestMapping("/")
	    @ResponseBody
	    String home() {
	        return "test SpringbootController!";
	    }
}
