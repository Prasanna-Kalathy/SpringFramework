package com.Alpha.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Alpha.learnspringframework.game.GameRunner;
import com.Alpha.learnspringframework.game.GamingConsole;

public class App03GamingSpringBeans {
	public static void main(String[] args) {

		try (var context = 
				new AnnotationConfigApplicationContext
					(GamingConfiguration.class)) {

			context.getBean(GamingConsole.class).Up();
			
			context.getBean(GameRunner.class).run();

		}
	}
}
