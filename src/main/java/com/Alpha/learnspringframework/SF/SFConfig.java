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

	@Bean
	public int age() {
		return 15;
	}

	// record is a new feature that replaces - getters,setters,hashcode,tostring
	// methods and separate class for
	record Person(String name, int age, Address ad_data) {
	};

	@Bean
	public Person data() {
		Person person_data = new Person(name(), age(), ad_data());
		return person_data;
	}

	record Address(String Add_Line_1, String City) {
	};
	
	@Bean (name="My_Ad_Data")
	public Address ad_data() {
		Address person_ad_data = new Address("Leaf Village", "Konaha");
		return person_ad_data;
	}
	
}
