package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * Springboot������
 * ʹ��˵��������Application���е�main����֮��
 * 		      �������������http://localhost:8080
 * 		     ���ɵõ�test SpringbootController!
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
