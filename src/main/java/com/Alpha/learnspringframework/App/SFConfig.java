package com.Alpha.learnspringframework.App;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

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
	public Person data(String name, int age, Address ad_data) {
		Person person_data = new Person(name, age, ad_data);
		return person_data;
	}

	record Address(String Add_Line_1, String City) {
	};
	
	@Bean 
	public Address ad_data() {
		Address person_ad_data = new Address("Leaf Village", "Konahagakure");
		return person_ad_data;
	}
	
	@Bean 
	@Primary
	public Address ad_data1() {
		Address person_ad_data = new Address("Mist Village", "Kirigakure");
		return person_ad_data;
	}
	
	@Bean(name = "sandVillageAddress")
	@Qualifier("sandVillage")
	public Address ad_data2() {
		Address person_ad_data = new Address("Sand Village", "Sunagakure");
		return person_ad_data;
	}
	
	
}
