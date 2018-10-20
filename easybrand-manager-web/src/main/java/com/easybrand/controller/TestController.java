package com.easybrand.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.easybrand.service.TestService;

@Controller
public class TestController {
	
	@Autowired
	private TestService service;
	
	@RequestMapping("/test/querynow")
	@ResponseBody
	public String queryNow() {
		return service.queryNow();
	}

}
