package com.abhi.spring.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Component

public class Dao {
	
	@Value("${db.driver}")
	
	String driver;
	String url;
	String username;
	String password;
	
	
	

}
