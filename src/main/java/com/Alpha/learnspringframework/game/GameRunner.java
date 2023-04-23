package com.Alpha.learnspringframework.game;

public class GameRunner {
//	MarioGame game;
	SuperContra game;
//Creating the parameterized constructor 
	public GameRunner(SuperContra game) {
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
