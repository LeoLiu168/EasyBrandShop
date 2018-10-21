package com.easybrand.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	
	@RequestMapping("/")
	public String showIndex() {
		return "index";
	}
	
	@RequestMapping("{page}")//如果参数不一样,@PathVariable的value值需要显示声明
	public String showPage(@PathVariable(value="page") String page3) {
		return page3;
	}

}
