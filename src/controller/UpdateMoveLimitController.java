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
		int newMoveLimit = (int) moveSpinner.getValue();
		model.getLevelTemplate().setMoveLimit(newMoveLimit);
		System.out.println(model.getLevelTemplate().getMoveLimit());
	}
	
	

}
