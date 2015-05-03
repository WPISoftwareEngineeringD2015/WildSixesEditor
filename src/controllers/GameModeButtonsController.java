package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import kiviuq.entities.GameMode;
import model.Model;

public class GameModeButtonsController implements ActionListener{

	JFrame selectFrame;
	JPanel builderPanel;
	Model model;
	GameMode mode;
	
	
	public GameModeButtonsController(JFrame s, JPanel b, Model m, GameMode gm) {
		this.selectFrame = s;
		this.builderPanel = b;
		this.model = m;
		this.mode = gm;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		model.getLevelTemplate().setGameMode(mode);
		builderPanel.setVisible(true);
		builderPanel.repaint();
		selectFrame.dispose();
	}

}


