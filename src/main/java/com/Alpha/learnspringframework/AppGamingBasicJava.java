package com.Alpha.learnspringframework;

import com.Alpha.learnspringframework.game.GameRunner;
import com.Alpha.learnspringframework.game.MarioGame;
import com.Alpha.learnspringframework.game.SuperContra;

public class AppGamingBasicJava {

	public static void main(String[] args) {
//Using var instead of explicitly mentioning the Object type		
//		var game = new MarioGame();
//		MarioGame marioGame = new MarioGame();
		var game = new SuperContra();
//		var gameRunner = new GameRunner(marioGame);
		var gameRunner = new GameRunner(game);
//		GameRunner gameRunner = new GameRunner(marioGame);
		gameRunner.run();
	}

}
