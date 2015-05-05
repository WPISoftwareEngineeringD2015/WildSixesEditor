package controllers;

import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import model.Model;

/**
 * Controller for updating MultConst value in level template
 * @author alyssagraham
 *
 */
public class UpdateMultiplierConstController implements ChangeListener{
	Model model;
	
	/**
	 * Constructor for UpdateMultiplierConstroller class
	 * @param m Model for level builder
	 */
	public UpdateMultiplierConstController(Model m) {
			this.model = m;
	}
	
	
	/**
	 * stateChanged function 
	 * gets the new value from the slider and sets the value in the level template
	 */
	@Override
	public void stateChanged(ChangeEvent e) {
		JSlider multiplierConst = (JSlider) e.getSource();
		int newMultConst = multiplierConst.getValue();
		model.getLevelTemplate().setMultConst(newMultConst);
	}
}
