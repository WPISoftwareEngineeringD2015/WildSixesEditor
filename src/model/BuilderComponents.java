package model;

import kiviuq.entities.TileType;
import controllers.UndoableEdits;

/**
 * BuildableComponents maintains information relevant to the builder.
 * It maintains what "Addable" tile is currently selected
 * @author alyssagraham
 *
 */



public class BuilderComponents {
	TileType currentAddable;
	UndoableEdits lastMove;
	UndoableEdits undoneMove;
	
	/**
	 * Constructor for BuilderComponents class
	 */
	public BuilderComponents() {
		this.currentAddable = TileType.Number;
		this.lastMove = null;
		this.undoneMove = null;
	}

	/**
	 * Set function for the current "Addable" tile type (attribute TileType currentAddable)
	 * @param t The type of "Addable" tile currently selected in the builder
	 */
	public void setCurrentAddable(TileType t) {
		this.currentAddable = t;
	}
	
	/**
	 * Get function for the current "Addable" tile type (attribute TileType currentAddable)
	 * @return Returns the tile type currently selected in the builder
	 */
	public TileType getCurrentAddable() {
		return this.currentAddable;
	}
	
	/**
	 * get method for UndoableEdits lastMove attribute
	 * @return returns UndoableEdits lastMove
	 */
	public UndoableEdits getLastMove() {
		return this.lastMove;
	}
	
	/**
	 * set method for UndoableEdits lastMove attribute
	 * @param lastMove value to set as the UndoableEdits lastMove attribute
	 */
	public void setLastMove(UndoableEdits lastMove) {
		this.lastMove = lastMove;
	}
	
	/**
	 * get method for UndoableEdits undoneMove attribute
	 * @return returns UndoableEdits undoneMove
	 */
	public UndoableEdits getUndoneMove() {
		return this.undoneMove;
	}
	
	/**
	 * set method for UndaobleEdits undoneMove attribute
	 * @param undoneMove value to set as the UndoableEdits undoneMove attribute
	 */
	public void setUndoneMove(UndoableEdits undoneMove) {
		this.undoneMove = undoneMove;
	}
	
}
