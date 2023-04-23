package com.Alpha.learnspringframework;

import com.Alpha.learnspringframework.game.GameRunner;
import com.Alpha.learnspringframework.game.MarioGame;
import com.Alpha.learnspringframework.game.SuperContra;

public class AppGamingBasicJava {

	public static void main(String[] args) {
//Using var instead of explicitly mentioning the Object type		
		var marioGame = new MarioGame();
//		MarioGame marioGame = new MarioGame();
		var superContra = new SuperContra();
//		var gameRunner = new GameRunner(marioGame);
		var gameRunner = new GameRunner(superContra);
//		GameRunner gameRunner = new GameRunner(marioGame);
		gameRunner.run();
	}

}
