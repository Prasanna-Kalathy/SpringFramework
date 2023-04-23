package com.Alpha.learnspringframework;

import java.util.Scanner;

import com.Alpha.learnspringframework.game.GameRunner;
import com.Alpha.learnspringframework.game.GamingConsole;
import com.Alpha.learnspringframework.game.MarioGame;
import com.Alpha.learnspringframework.game.PACMAN;
import com.Alpha.learnspringframework.game.SuperContra;

public class AppGamingBasicJava {

	public static void main(String[] args) {
//Using var instead of explicitly mentioning the Object type		
		Scanner In = new Scanner(System.in);
		System.out.println("Enter Your game of Choice");
		System.out.println("1. Mario");
		System.out.println("2. Super Contra");
		System.out.println("3. PACMAN");
		int UI = In.nextInt();
		GamingConsole game;
		if (UI==1) {
			 game = new MarioGame();
//			MarioGame marioGame = new MarioGame();
		}
		else if(UI==2) {
			 game = new SuperContra();
//			var gameRunner = new GameRunner(marioGame);
		}else {
			 game = new PACMAN();
//			var gameRunner = new GameRunner(marioGame);
		}
		var gameRunner = new GameRunner(game);
//		GameRunner gameRunner = new GameRunner(marioGame);
		gameRunner.run();
	}

}
