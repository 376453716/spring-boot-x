package com.xh.demo.service;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author Xiong Hao
 * @date 2020/4/6
 */
@Service
@Data
public class DemoService {

	@Value("${service.name}")
	private String serviceName;
}
