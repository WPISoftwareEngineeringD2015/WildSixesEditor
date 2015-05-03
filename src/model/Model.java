package model;

import kiviuq.entities.Board;
import kiviuq.entities.LevelTemplate;

/**
 * Model class for the level builder
 * Aggregate of the entity classes
 * @author alyssagraham
 *
 */
public class Model {
	LevelTemplate temp;
	public static final int BOARD_LENGTH = 9;
	public static final int BOARD_WIDTH = 9;
	FileIO files;
	Board board;
	BuilderComponents components;
	
	/**
	 * Constructor method for Model class
	 */
	public Model() {
		this.temp = new LevelTemplate();
		this.files = new FileIO();
		this.board = Board.MakeBoardFromTemplate(temp);
		this.components = new BuilderComponents();
	}
	
	/**
	 * get method for LevelTemplate temp
	 * @return LevelTemplate temp
	 */
	public LevelTemplate getLevelTemplate() {
		return this.temp;
	}
	
	/**
	 * get method for FileIO files
	 * @return FileIO files
	 */
	public FileIO getFiles() {
		return this.files;
	}
	
	/**
	 * get method for Board board
	 * @return Board board
	 */
	public Board getBoard() {
		return this.board;
	}
	
	/**
	 * set method for LevelTemplate temp
	 * @param newLT new LevelTemplate to be set as LevelTemplate temp attribute
	 */
	public void setLevelTemplate(LevelTemplate newLT) {
		this.temp = newLT;
		this.board = Board.MakeBoardFromTemplate(temp);
	}
	
	/**
	 * get method for BuilderComponents components
	 * @return BuilderComponents components
	 */
	public BuilderComponents getBuilderComponents() {
		return this.components;
	}
	
}
