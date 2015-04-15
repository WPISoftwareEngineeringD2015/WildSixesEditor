package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import view.LevelTypeView;

public class ChangeLevelTypeController implements ActionListener{
	JPanel panel;
	LevelTypeView typePanel;
	
	
	public ChangeLevelTypeController(JPanel builder, LevelTypeView typeView) {
		this.panel = builder;
		this.typePanel = typeView;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//panel.setVisible(false);
		panel.setVisible(false);
		typePanel.setVisible(true);
	}
	
}
