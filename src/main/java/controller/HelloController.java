package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*
 * 基于ssm框架的第一个控制器
 * 1.添加@Controller标注
 * 2.方法添加映射路径
 * @auther SXT
 * @since jdk8
 * 
 */
@Controller
public class HelloController {
	
	@RequestMapping("/hi")
	@ResponseBody
	public String hello() {
		return "hello nuc-a";
	}
}
