package com.Alpha.learnspringframework.SF;

import java.util.Scanner;

import com.Alpha.learnspringframework.game.GameRunner;
import com.Alpha.learnspringframework.game.GamingConsole;
import com.Alpha.learnspringframework.game.MarioGame;
import com.Alpha.learnspringframework.game.PACMAN;
import com.Alpha.learnspringframework.game.SuperContra;

public class App01 {

	public static void main(String[] args) {
		Scanner In = new Scanner(System.in);
		System.out.println("Enter Your game of Choice");
		System.out.println("1. Mario");
		System.out.println("2. Super Contra");
		System.out.println("3. PACMAN");
		int UI = In.nextInt();
		GamingConsole game;
		if (UI == 1) {
			game = new MarioGame(); // 1. Object Creation
		} else if (UI == 2) {
			game = new SuperContra();
		} else {
			game = new PACMAN();
		}
		var gameRunner = new GameRunner(game);
		// 2. Object creation and wiring dependency
		// game is a dependency of the GameRunner class
		gameRunner.run();
	}

}
