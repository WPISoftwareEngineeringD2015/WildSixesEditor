package model;

public class Model {
	LevelTemplate temp;
	public static final int BOARD_LENGTH = 9;
	public static final int BOARD_WIDTH = 9;
	
	public Model() {
		this.temp = new LevelTemplate();
	}
	
	public LevelTemplate getLevelTemplate() {
		return this.temp;
	}
	
}
