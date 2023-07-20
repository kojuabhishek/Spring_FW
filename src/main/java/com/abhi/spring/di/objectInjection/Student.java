package com.abhi.spring.di.objectInjection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data


public class Student {
	int id;
	String name;
	String email;
	Laptop laptop;

}
