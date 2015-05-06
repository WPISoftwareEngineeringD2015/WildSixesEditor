package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Model;
import views.BuilderPanel;
import views.GameModeSelectFrame;

/**
 * ChangeLevelTypeController displays select level type frame
 * @author Alyssa
 *
 */
public class ChangeLevelTypeController implements ActionListener{
	BuilderPanel panel;

	Model model;
	
	/**
	 * Constructor for ChangeLevelTypeController
	 * @param builder builder panel for level builder
	 * @param m model for level builder
	 */
	public ChangeLevelTypeController(BuilderPanel builder, Model m) {
		this.panel = builder;
		this.model = m;
	}
	
	/**
	 * Override actionPerformed method for ChangeLevelTypeController
	 * Displays select level type frame
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		GameModeSelectFrame selectGameMode = new GameModeSelectFrame(panel, model);
		selectGameMode.selectNewGameMode();
	}
	
}
