package model;

public class Tile {
	int number;
	TileType type;
	boolean isSelected;
	
	public Tile(int number) {
		this(number, TileType.Number);
	}
	
	public Tile(TileType type) {
		this(-1, type);
	}
	
	public Tile(int number, TileType type) {
		this.number = number;
		this.type = type;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setType(TileType type) {
		switch(type) {
		case Null:
			this.type = TileType.Null;
			break;
		case Number:
			this.type = TileType.Number;
			this.number = 2;
			break;
		case Release:
			this.type = TileType.Release;
			break;
		}
	}
	
	public TileType getType() {
		return type;
	}
	
	@Override 
	public String toString() {
		String str = "";
		switch (type) {
			default: break;
			case Number:
				str = number + "";
			case Null:
				break;
			case Release:
				str = "R";
		}
		return str;
	}
	
	public boolean isSelected() {
		return isSelected;
	}
	
	public void select() {
		isSelected = true;
	}
	
	public void unSelect() {
		isSelected = false;
	}
	
}
