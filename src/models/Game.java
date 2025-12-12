package models;

public class Game {
	private String name;
	private int releaseDate;
	private int levelDifficulty;
	
	
	public Game(String name, int releaseDate, int levelDifficulty) {
		super();
		this.name = name;
		this.releaseDate = releaseDate;
		this.levelDifficulty = levelDifficulty;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getReleaseDate() {
		return releaseDate;
	}


	public void setReleaseDate(int releaseDate) {
		this.releaseDate = releaseDate;
	}


	public int getLevelDifficulty() {
		return levelDifficulty;
	}


	public void setLevelDifficulty(int levelDifficulty) {
		this.levelDifficulty = levelDifficulty;
	}


	@Override
	public String toString() {
		return "Game [name=" + name + ", releaseDate=" + releaseDate + ", levelDifficulty=" + levelDifficulty + "]";
	}
	
	
	
	
	
	
	
}
