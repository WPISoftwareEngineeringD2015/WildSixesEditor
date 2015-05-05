package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Model;



public class UndoController implements ActionListener{
	Model model;
	UndoableEdits lastMove;
	
	
	public UndoController(Model m) {
		this.model = m;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		this.lastMove = model.getBuilderComponents().getLastMove();
		if(lastMove != null) {
			// Set the move before the move being undone to the new last move
			// Set the undone move as the undonemove in the builder components class
			model.getBuilderComponents().setUndoneMove(lastMove);
			model.getBuilderComponents().getLastMove().undo();
			model.getBuilderComponents().setLastMove(lastMove.getPreviousMove());
		}
		else {
			return;
		}
	}
}
