package model;

public class Model {
	LevelTemplate temp;
	public static final int BOARD_LENGTH = 9;
	public static final int BOARD_WIDTH = 9;
	FileIO files;
	Board board;
	BuilderComponents components;
	
	public Model() {
		this.temp = new LevelTemplate();
		this.files = new FileIO();
		this.board = new Board(temp);
		this.components = new BuilderComponents();
	}
	
	public LevelTemplate getLevelTemplate() {
		return this.temp;
	}
	
	public FileIO getFiles() {
		return this.files;
	}
	
	public Board getBoard() {
		return this.board;
	}
	
	public void setLevelTemplate(LevelTemplate newLT) {
		this.temp = newLT;
		this.board = new Board(temp);
	}
	
	public BuilderComponents getBuilderComponents() {
		return this.components;
	}
	
}
