package com.xh.demo;

import com.xh.demo.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author Xiong Hao
 * @date 2020/4/6
 */
@Component
public class DemoServicePostProcesser implements BeanPostProcessor {
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (beanName.equals("demoService")) {
			DemoService demoService = (DemoService) bean;
			System.out.println("===>" + demoService.getServiceName());
		}
		return bean;
	}
}
