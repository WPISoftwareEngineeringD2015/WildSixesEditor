package model;

import java.io.Serializable;

/**
 * LevelTemplate class represents the information needed for Sixes Wild to construct a level
 * @author 
 * @author alyssagraham
 *
 */

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
	
	/**
	 * Full constructor for LevelTemplate class
	 * @param levelNumber what number in a series of levels the level is
	 * @param mode what GameMode the level is (puzzle, lightning, elimination, release)
	 * @param timeLimit the time limit for lightning mode levels
	 * @param moveLimit the move limit for elimination mode levels
	 * @param random1 
	 * @param random2
	 * @param random3
	 * @param random4
	 * @param random5
	 * @param starCriteria the starCriteria for the level @see StarCriteria
	 */
	public LevelTemplate(int levelNumber, GameMode mode, int timeLimit, int moveLimit, int random1, int random2, int random3,
			int random4, int random5, StarCriteria starCriteria) {
		this.levelNumber = levelNumber;
		this.mode = mode;
		this.timeLimit = timeLimit;
		this.moveLimit = moveLimit;
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
	/**
	 * null constructor for LevelTemplate 
	 * Sets defaults for a fresh level template used in the level builder
	 */
	public LevelTemplate() {
		this.starCriteria = null;
		this.mode = GameMode.Puzzle;
		this.grid = new TileType[Model.BOARD_LENGTH][Model.BOARD_WIDTH];
		for (int x = 0; x < Model.BOARD_LENGTH; x++) {
			for (int y = 0; y < Model.BOARD_WIDTH; y++) {
				grid[x][y] = TileType.Null;
			}
		}
		this.moveLimit = 10;
		this.starCriteria = new StarCriteria();
	}
	
	/**
	 * get method for StarCriteria starCriteria
	 * @return StarCriteria starCriteria
	 */
	public StarCriteria getStarCriteria() {
		return starCriteria;
	}
	
	/**
	 * get method for TileType[][] grid
	 * @return TileType[][] grid
	 */
	public TileType[][] getGridTemplate() {
		return grid;
	}
	
	/**
	 * set method for TileType[x][y] grid
	 * @param x x coordinate of TileType to change
	 * @param y y coordinate of TileType to change
	 * @param tt TileType to set at the above coordinates
	 */
	public void setTileTypeAtPosition(int x, int y, TileType tt) {
		grid[x][y] = tt ;
	}
	
	/**
	 * get method for GameMode mode
	 * @return GameMode mode
	 */
	public GameMode getGameMode() {
		return this.mode;
	}
	
	/**
	 * set method for GameMode mode
	 * @param m GameMode to set GameMode mode attribute to
	 */
	public void setGameMode(GameMode m) {
		this.mode = m;
	}
	
	/**
	 * set method for TileType[][] grid
	 * @param g TileType[][] to set TileType[][] grid attribute to
	 */
	public void setGrid(TileType[][] g) {
		this.grid = g;
	}
	
	/**
	 * get method for int moveLimit
	 * @return int moveLimit
	 */
	public int getMoveLimit() {
		return moveLimit;
	}
	
	/**
	 * set method for int moveLimit
	 * @param i int to set int moveLimit attribute to
	 */
	public void setMoveLimit(int i) {
		this.moveLimit = i;
	}
	
	/**
	 * get method for int timeLimit
	 * @return int timeLimit
	 */
	public int getTimeLimit() {
		return timeLimit;
	}
	
	/**
	 * set method for int timeLimit
	 * @param i int to set int timeLimit attribute to
	 */
	public void setTimeLimit(int i) {
		this.timeLimit = i;
	}
	
}
