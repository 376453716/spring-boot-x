package com.xh.demo.controller;

import com.xh.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Xiong Hao
 * @date 2020/4/6
 */
@RestController
public class DemoController {

	@Autowired
	TestService testService;

	@GetMapping("/")
	public String get() {
		return testService.getServiceName();
	}
}
