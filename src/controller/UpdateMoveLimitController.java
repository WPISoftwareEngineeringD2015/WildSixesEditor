package controller;

import javax.swing.JSpinner;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import model.Model;

public class UpdateMoveLimitController implements ChangeListener{
	Model model;
	
	public UpdateMoveLimitController(Model m) {
		this.model = m;
	}
	
	
	@Override
	public void stateChanged(ChangeEvent e) {
		JSpinner moveSpinner = (JSpinner) e.getSource();
		// Changed from a cast to this combo of functions for compatibility with 1.6 
		// Can change back later - doing this so I can work on this at work
		int newMoveLimit = Integer.parseInt(moveSpinner.getValue().toString());
		model.getLevelTemplate().setMoveLimit(newMoveLimit);
	}
	
	

}
