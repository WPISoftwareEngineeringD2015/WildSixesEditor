package views;

import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.JPanel;

import kiviuq.entities.Tile;
import model.Model;
import controllers.SelectTileController;
/**
 * BoardView
 * @author Evin Ugur
 * @author Alyssa
 *
 */
public class BoardView extends JPanel {
	Model model;
	/**
	 * auto-generated by Eclipse
	 */
	private static final long serialVersionUID = 1L;
	
	//Board board;
	TileView[][] tvs;
	/**
	 * Constructor for BoardView class
	 * @param m Model for level builder
	 */
	public BoardView(Model m) {
		super();
		this.model = m;
		
		tvs = new TileView[9][9];
		setLayout(new GridLayout(9, 9, 3, 3));
		Tile[][] grid = m.getBoard().getGrid();
		for (int x = 0; x < 9; x++) {
			for (int y = 0; y < 9; y++) {
				tvs[x][y] = new TileView(grid[x][y], model);
				tvs[x][y].addMouseListener(new SelectTileController(model, this));
				add(tvs[x][y]);
			}
		}
	}
	
	/**
	 * Override paintComponent method refreshes BoardView
	 */
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Tile[][] grid = model.getBoard().getGrid();
		for (int x = 0; x < 9; x++) {
			for (int y = 0; y < 9; y++) {
				tvs[x][y].setTile(grid[x][y]);
			}
		}
	}
	
	
	public void repaintTiles() {
		for (TileView[] r : tvs) 
			for (TileView t : r) {
				t.repaint();
			}
				
	}
}
