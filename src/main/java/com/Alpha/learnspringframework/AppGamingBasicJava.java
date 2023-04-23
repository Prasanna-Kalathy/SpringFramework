package com.Alpha.learnspringframework;

import com.Alpha.learnspringframework.game.GameRunner;
import com.Alpha.learnspringframework.game.MarioGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
//Using var instead of explicitly mentioning the Object type		
		var marioGame = new MarioGame();
//		MarioGame marioGame = new MarioGame();
		var gameRunner = new GameRunner(marioGame);
//		GameRunner gameRunner = new GameRunner(marioGame);
		gameRunner.run();
	}

}
