package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import model.Model;
import views.BuilderPanel;

/**
 * UpdateStarCriteria updates the score thresholds in the level template
 * @author Alyssa
 *
 */
public class UpdateStarCriteria implements ActionListener{
	Model model;
	BuilderPanel panel;
	int oneStarValue;
	int twoStarValue;
	int threeStarValue;
	
	/**
	 * Constructor for UpdateStarCriteria class
	 * @param m Model for level builder
	 * @param p builder panel for level builder
	 */
	public UpdateStarCriteria(Model m, BuilderPanel p) {
		this.model = m;
		this.panel = p;
		this.oneStarValue = 0;
		this.twoStarValue = 0;
		this.threeStarValue = 0;
	}
	
	/**
	 * Override actionPerformed method for UpdateStarCriteria
	 * gets the star criteria values and sets them in the level template
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		JTextField oneStar = panel.getScoreView().getOneStars();
		JTextField twoStar = panel.getScoreView().getTwoStars();
		JTextField threeStar = panel.getScoreView().getThreeStars();
		
		if(oneStar.getText() != null) {
			oneStarValue = Integer.parseInt(oneStar.getText());
		}
		
		if(twoStar.getText() != null) {
			twoStarValue = Integer.parseInt(twoStar.getText());
		}
		
		if(threeStar.getText() != null) {
			threeStarValue = Integer.parseInt(threeStar.getText());
		}
		
		
		model.getLevelTemplate().getStarCriteria().setPoints1(oneStarValue);
		model.getLevelTemplate().getStarCriteria().setPoints2(twoStarValue);
		model.getLevelTemplate().getStarCriteria().setPoints3(threeStarValue);
	}	
}
