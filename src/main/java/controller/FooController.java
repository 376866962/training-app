package controller;
/**
 * 测试Git
 * @author lenobo
 *
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FooController {
	@GetMapping("/haa")
	@ResponseBody
	public String foo() {
	return "haa";
	}
}
