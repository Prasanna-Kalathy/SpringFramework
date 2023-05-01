package com.Alpha.learnspringframework.App;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Alpha.learnspringframework.App.SFConfig.Address;

public class App02 {

	public static void main(String[] args) {
		// We need to create and configure a spring context
		// create beans to be managed by spring

		// Launching spring context with help of configuration file(SFConfig)
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SFConfig.class);

		// use context to get the beans(object) from configuration file

		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("data"));
		System.out.println(context.getBean("ad_data"));
		System.out.println(context.getBean(Address.class));
		System.out.println(context.getBean("sandVillageAddress", Address.class));

		
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		System.out.println(context.getBeanDefinitionCount());
		
	}

}
