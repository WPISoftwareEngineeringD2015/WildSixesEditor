package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Model;
/**
 * UndoController controls undoing edits to the currently being edited level
 * @author Alyssa
 *
 */
public class UndoController implements ActionListener{
	Model model;
	UndoableEdits lastMove;
	
	/**
	 * Constructor for UndoController
	 * @param m Model for level builder
	 */
	public UndoController(Model m) {
		this.model = m;
	}
	
	/**
	 * Override actionPerformed function sets the move being undone as the last undone move, undoes the move, and sets the previous move to the undone move
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		this.lastMove = model.getBuilderComponents().getLastMove();
		if(lastMove != null) {
			// Set the move before the move being undone to the new last move
			// Set the undone move as the undonemove in the builder components class
			model.getBuilderComponents().setUndoneMove(lastMove);
			//model.getBuilderComponents().getLastMove().undo();
			model.getBuilderComponents().setLastMove(lastMove.getPreviousMove());
			lastMove.undo();
		}
		else {
			return;
		}
	}
}
