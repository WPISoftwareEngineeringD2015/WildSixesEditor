package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

import kiviuq.entities.*;
import model.Model;
import views.BoardView;
import views.TileView;
/**
 * @author 
 * @author alyssagraham
 *
 */
public class SelectTileController implements UndoableEdits {
	Model model;
	BoardView boardView;
	boolean isMousePressed;
	UndoableEdits previousMove;
	TileView sourcePanel;
	TileType typeToSet;
	TileType previousType;

	/**
	 * Constructor for SelectTileController class
	 * @param m Model for level builder
	 * @param b builder panel for level builder
	 */
	public SelectTileController(Model m, BoardView b) {
		this.model = m;
		this.boardView = b;
		this.previousMove = m.getBuilderComponents().getLastMove();
		//this.moveType = boardView.getBoard().getMoveType();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	
	/**
	 * mousePressed method for Selecting tiles on the board in the level builder
	 */
	@Override
	public void mousePressed(MouseEvent e) {
		isMousePressed = true;
		sourcePanel = (TileView) e.getSource();
		previousType = sourcePanel.getTile().getType();
		typeToSet = model.getBuilderComponents().getCurrentAddable();
		sourcePanel.getTile().setType(typeToSet);
		model.getBuilderComponents().setLastMove(this); // set this as the last move performed in the level builder
		boardView.repaintTiles();
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
		model.getLevelTemplate().setGrid(model.getBoard().convertGrid());
		model.getBoard().unselectTiles();
		boardView.repaintTiles();
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

	@Override
	public void undo() {
		sourcePanel.getTile().setType(previousType);
		model.getLevelTemplate().setGrid(model.getBoard().convertGrid());
		model.getBoard().unselectTiles();
		boardView.repaintTiles();
		model.getBuilderComponents().setLastMove(previousMove); // return the move before this to the builderComponents class
	}

	@Override
	public void redo() {
		sourcePanel.getTile().setType(typeToSet);
		model.getBuilderComponents().setLastMove(this); // set this as the last move performed in the level builder
		boardView.repaintTiles();
		model.getLevelTemplate().setGrid(model.getBoard().convertGrid());
		model.getBoard().unselectTiles();
		boardView.repaintTiles();
	}
}
