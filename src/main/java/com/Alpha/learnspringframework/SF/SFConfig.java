package com.Alpha.learnspringframework.SF;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SFConfig {
	// This method produces a bean which is managed by the spring container
	@Bean
	public String name() {
		return "Prasanna";
	}
}
