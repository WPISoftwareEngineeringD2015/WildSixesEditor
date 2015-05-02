package model;

/**
 * BuildableComponents maintains information relevant to the builder.
 * It maintains what "Addable" tile is currently selected
 * @author alyssagraham
 *
 */



public class BuilderComponents {
	TileType currentAddable;
	
	/**
	 * Constructor for BuilderComponents class
	 */
	public BuilderComponents() {
		this.currentAddable = TileType.Number;
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
	
}
