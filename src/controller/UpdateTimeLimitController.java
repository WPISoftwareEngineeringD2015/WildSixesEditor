package controller;

import javax.swing.JSpinner;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import model.Model;

public class UpdateTimeLimitController implements ChangeListener{
	Model model;
	
	public UpdateTimeLimitController(Model m) {
		this.model = m;
	}
	
	
	@Override
	public void stateChanged(ChangeEvent e) {
		JSpinner moveSpinner = (JSpinner) e.getSource();
		int newTimeLimit = (int) moveSpinner.getValue();
		model.getLevelTemplate().setTimeLimit(newTimeLimit);
	}
}
