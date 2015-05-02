package model;

public class BuilderComponents {
	TileType currentAddable;
	
	public BuilderComponents() {
		this.currentAddable = TileType.Number;
	}

	public void setCurrentAddable(TileType t) {
		this.currentAddable = t;
	}
	
	public TileType getCurrentAddable() {
		return this.currentAddable;
	}
	
}
