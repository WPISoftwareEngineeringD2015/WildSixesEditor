package controllers;

import javax.swing.JSpinner;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import model.Model;

/**
 * UpdateTimeLimitController class updates the timeLimit attribute in the level template when the user selects a new value
 * @author alyssagraham
 *
 */

public class UpdateTimeLimitController implements ChangeListener{
	Model model;
	
	/**
	 * Constructor method for UpdateTimeLimitController class
	 * @param m Model object for builder
	 */
	public UpdateTimeLimitController(Model m) {
		this.model = m;
	}
	
	/**
	 * Override stateChanged method
	 * gets the new value of the JSpinner when altered and sets the new value in the level template
	 */
	@Override
	public void stateChanged(ChangeEvent e) {
		JSpinner moveSpinner = (JSpinner) e.getSource();
		// Changed from a cast to this combo of functions for compatibility with 1.6 
		// Can change back later - doing this so I can work on this at work
		int newTimeLimit = Integer.parseInt(moveSpinner.getValue().toString());
		model.getLevelTemplate().setTimeLimit(newTimeLimit);
	}
}
