package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import model.Model;
import model.TileType;
import views.BoardView;
import views.TileView;

public class SelectTileController implements MouseListener {
	Model model;
	BoardView boardView;
	//MoveType moveType;
	boolean isMousePressed;

	public SelectTileController(Model m, BoardView b) {
		this.model = m;
		this.boardView = b;
		//this.moveType = boardView.getBoard().getMoveType();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	/*@Override
	public void mouseEntered(MouseEvent e) {
		TileView sourcePanel = (TileView) e.getSource();
		if(isMousePressed) {
			sourcePanel.getTile().select();
			sourcePanel.repaint();
			//boardView.getBoard().addTileSum(sourcePanel.getTile().getNumber());
		}
	}*/

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		isMousePressed = true;
		TileView sourcePanel = (TileView) e.getSource();
		sourcePanel.getTile().setType(TileType.Number);
		boardView.repaintTiles();
		//sourcePanel.repaint();
		//boardView.getBoard().addTileSum(sourcePanel.getTile().getNumber());
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
//		isMousePressed = false;
		//TileView sourcePanel = (TileView) e.getSource();
	//	boardView.getBoard().resetTileSum();
		model.getBoard().resetTiles();
		boardView.repaintTiles();
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
