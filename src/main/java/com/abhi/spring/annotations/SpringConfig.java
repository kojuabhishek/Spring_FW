package com.abhi.spring.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan(basePackages = "com.abhi.spring.annotations")


public class SpringConfig {
	
	@Bean(name="dataAccessObject")
	public Dao getDao() {
		return new Dao("url","driver","username","password");
	}

}
