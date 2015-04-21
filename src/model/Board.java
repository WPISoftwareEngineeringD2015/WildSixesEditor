package model;


public class Board {
	LevelTemplate template;
	Tile[][] grid;

	public Board(LevelTemplate template) {
		this.template = template;
		grid = new Tile[9][9];
		TileType[][] gridTemplate = template.getGridTemplate();
		for (int x = 0; x < 9; x++) {
			for (int y = 0; y < 9; y++) {
				TileType type = gridTemplate[x][y];
				Tile t;
				if (type == TileType.Number)
					t = getNextTile();
				else
					t = new Tile(type); // it's a null or release tile
				grid[x][y] = t;
			}
		}
	}

	/*@SuppressWarnings("unused")
	// TODO delete this when we are confident we don't need it anymore
	private void insertNullsForTesting() {
		for (int i = 0; i < 3; i++) {
			Random r = new Random();
			int x = r.nextInt(9);
			int y = r.nextInt(9);
			grid[x][y] = null;
		}
	}*/


	public Tile[][] getGrid() {
		return grid;
	}

	public void setGrid(Tile[][] grid) {
		this.grid = grid;
	}

	public boolean emptyTilesOnBoard() {
		for (Tile[] r : grid)
			for (Tile t : r)
				if (t == null)
					return true;
		return false;
	}

	public Tile getNextTile() {
		// TODO implement this with an actual randomly weighted tile
		return new Tile(Math.random() > 0.5 ? 1 : 2);
		// for now just give us a Tile valued 1 or 2
	}

	public LevelTemplate getTemplate() {
		return template;
	}

/*	public void setTemplate(LevelTemplate template) {
		this.template = template;
	}*/

	public void resetTiles() {
		for (Tile[] r : grid)
			for (Tile t : r) {
				t.unSelect();
			}

	}


}
