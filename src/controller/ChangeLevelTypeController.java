package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Model;
import views.BuilderPanel;
import views.GameModeSelectFrame;

public class ChangeLevelTypeController implements ActionListener{
	BuilderPanel panel;

	Model model;
	
	public ChangeLevelTypeController(BuilderPanel builder, Model m) {
		this.panel = builder;
		this.model = m;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		GameModeSelectFrame selectGameMode = new GameModeSelectFrame(panel, model);
		selectGameMode.selectNewGameMode();
	}
	
}
