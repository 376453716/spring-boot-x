package com.xh.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Xiong Hao
 * @date 2020-05-14
 */
@Component
public class TestService {

	@Value("${service.name}")
	private String serviceName;

	public String getServiceName() {
		return serviceName;
	}
}
