package services;

import java.util.ArrayList;

import models.Game;

public class GameService {
	
	private ArrayList<Game> games = new ArrayList<Game>();
	
	public void insertGame (String n, int r, int l) {
		Game game = new Game(n, r, l);
		
		this.games.add(game);
	}
	
	public void printGamesList() {
		for (int i = 0; i < this.games.size(); i++) {
			System.out.println(this.games.get(i));
		}
	}
}	