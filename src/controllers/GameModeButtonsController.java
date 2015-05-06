package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import kiviuq.entities.GameMode;
import model.Model;

/**
 * GameModeButtonsController changes the game's mode or level type after selecting a new level type from the level type select screen
 * @author Alyssa
 *
 */

public class GameModeButtonsController implements ActionListener{

	JFrame selectFrame;
	JPanel builderPanel;
	Model model;
	GameMode mode;
	
	/**
	 * Constructor for GameModeButtonsController
	 * @param s Select Level type frame
	 * @param b builder panel for the level editor
	 * @param m Model for the level editor
	 * @param gm GameMode that was selected
	 */
	public GameModeButtonsController(JFrame s, JPanel b, Model m, GameMode gm) {
		this.selectFrame = s;
		this.builderPanel = b;
		this.model = m;
		this.mode = gm;
	}
	
	/**
	 * Override actionPerformed methodd for GameModeButtonsController refreshes board after a level type has been selected
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		model.getLevelTemplate().setGameMode(mode);
		builderPanel.setVisible(true);
		builderPanel.repaint();
		selectFrame.dispose();
	}

}


