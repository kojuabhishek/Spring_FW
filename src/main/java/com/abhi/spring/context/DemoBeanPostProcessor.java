package com.abhi.spring.context;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class DemoBeanPostProcessor implements BeanPostProcessor {
	public Object postProcessAfterInitialization(Object bean, String beanName) {
		
		System.out.println("After bean initialization");
		return bean;
		
	}
public Object postProcessBeforeInitialization(Object bean, String beanName) {
		
		System.out.println("Before bean initialization");
		return bean;
		
	}
	
	

}
