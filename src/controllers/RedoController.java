package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Model;

/**
 * RedoController handles redoing an undone move
 * @author alyssagraham
 *
 */
public class RedoController implements ActionListener{
	Model model;
	UndoableEdits undoneMove;
	
	/**
	 * Constructor class for RedoController
	 * @param m Model for level builder
	 */
	public RedoController(Model m) {
		this.model = m;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		this.undoneMove = model.getBuilderComponents().getUndoneMove();
		if(undoneMove != null) {
			undoneMove.redo();
			model.getBuilderComponents().setLastMove(undoneMove);
		}
		else {
			return;
		}
	}
	
	

}
