package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Model;



public class UndoController implements ActionListener{
	Model model;
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(model.getBuilderComponents().getLastMove() != null) {
			// Set the move before the move being undone to the new last move
			model.getBuilderComponents().setLastMove(model.getBuilderComponents().getLastMove().getPreviousMove());
			
		}
		else {
			return;
		}
	}
}
