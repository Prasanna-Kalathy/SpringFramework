package com.Alpha.learnspringframework.game;

public class GameRunner {
	MarioGame game;
//Creating the parameterized constructor 
	public GameRunner(MarioGame game) {
		this.game = game;
	}

	public void run() {
		System.out.println("Running Game: " + game);
		game.Up();
		game.Down();
		game.Left();
		game.Right();
	}

}
