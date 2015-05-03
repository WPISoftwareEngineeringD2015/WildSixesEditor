package controllers;

import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import model.Model;

/**
 * UpdateDifficultyController updates the difficult of the level
 * @author alyssagraham
 *
 */
public class UpdateDifficultyController implements ChangeListener{
	Model model;
	
	/**
	 * Constructor method for UpdateDifficultyController class
	 * @param m
	 */
	public UpdateDifficultyController(Model m) {
		this.model = m;
	}
	
	/**
	 * stateChanged method override for UpdateDifficultyController
	 * Sets the current slider value as the probConst attribute in the levelTemplate
	 */
	@Override
	public void stateChanged(ChangeEvent e) {
		JSlider difficultySlider = (JSlider) e.getSource();
	
		int newDifficulty = difficultySlider.getValue();
		model.getLevelTemplate().setProbConst(newDifficulty);
	}
	
}
