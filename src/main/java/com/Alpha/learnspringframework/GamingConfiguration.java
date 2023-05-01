package com.Alpha.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.Alpha.learnspringframework.game.GameRunner;
import com.Alpha.learnspringframework.game.GamingConsole;
import com.Alpha.learnspringframework.game.PACMAN;

@Configuration
public class GamingConfiguration {
	@Bean
	public GamingConsole game() {
		var game = new PACMAN();
		return game;
	}

	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}

}
