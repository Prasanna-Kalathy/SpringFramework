package com.Alpha.learnspringframework.game;

public class GameRunner {
//	MarioGame game;
	 GamingConsole game;
//Creating the parameterized constructor 
	public GameRunner(GamingConsole game) {
		this.game = game;
	}

	public void run() {
		System.out.println("Running Game: " + game.getClass());
		game.Up();
		game.Down();
		game.Left();
		game.Right();
	}

}
