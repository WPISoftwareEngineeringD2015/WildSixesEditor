package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

import kiviuq.entities.*;
import model.Model;
import views.BoardView;
import views.TileView;

public class SelectTileController implements UndoableEdits {
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
		TileType typeToSet = model.getBuilderComponents().getCurrentAddable();
		sourcePanel.getTile().setType(typeToSet);
		boardView.repaintTiles();
		//sourcePanel.repaint();
		//boardView.getBoard().addTileSum(sourcePanel.getTile().getNumber());
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
//		isMousePressed = false;
		//TileView sourcePanel = (TileView) e.getSource();
	//	boardView.getBoard().resetTileSum();
		model.getLevelTemplate().setGrid(model.getBoard().convertGrid());
		model.getBoard().unselectTiles();
		boardView.repaintTiles();
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void redo() {
		// TODO Auto-generated method stub
		
	}
}
