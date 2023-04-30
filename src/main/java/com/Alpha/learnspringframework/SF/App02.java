package com.Alpha.learnspringframework.SF;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02 {

	public static void main(String[] args) {
		//We need to create and configure a spring context 
		//create beans to be managed by spring 
		
		//Launching spring context with help of configuration file(SFConfig)
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SFConfig.class);
		
		
	}

}
