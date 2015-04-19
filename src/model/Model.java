package model;

public class Model {
	LevelTemplate temp;
	public static final int BOARD_LENGTH = 9;
	public static final int BOARD_WIDTH = 9;
	FileIO files;
	
	public Model() {
		this.temp = new LevelTemplate();
		this.files = new FileIO();
	}
	
	public LevelTemplate getLevelTemplate() {
		return this.temp;
	}
	
	public FileIO getFiles() {
		return this.files;
	}
	
}
