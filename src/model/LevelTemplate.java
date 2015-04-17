package model;

import java.io.Serializable;

public class LevelTemplate implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -9104499374831536471L;
	int levelNumber;
	GameMode mode;
	TileType[][] grid;
	int timeLimit;
	int moveLimit;
	int random1, random2, random3, random4, random5;
	StarCriteria starCriteria;
	
	public LevelTemplate(int levelNumber, GameMode mode, int timeLimit, int moveLimit, int random1, int random2, int random3,
			int random4, int random5, StarCriteria starCriteria) {
		this.levelNumber = levelNumber;
		this.mode = mode;
		this.timeLimit = timeLimit;
		this.moveLimit =moveLimit;
		this.random1 = random1;
		this.random2 = random2;
		this.random3 = random3;
		this.random4 = random4;
		this.random5 = random5;
		this.starCriteria = starCriteria;
		grid = new TileType[Model.BOARD_LENGTH][Model.BOARD_WIDTH];	
		for (int x = 0; x < Model.BOARD_LENGTH; x++) {
			for (int y = 0; y < Model.BOARD_WIDTH; y++) {
				grid[x][y] = TileType.Number;
			}
		}
	}
	
	// necessary to have a blank constructor for constructing fresh levels to edit
	public LevelTemplate() {
		this.starCriteria = null;
		this.mode = GameMode.Puzzle;
	}
	
	public StarCriteria getStarCriteria() {
		return starCriteria;
	}
	
	public TileType[][] getGridTemplate() {
		return grid;
	}
	
	public void setTileTypeAtPosition(int x, int y, TileType tt) {
		grid[x][y] = tt ;
	}
	
}
