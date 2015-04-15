package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import model.Model;
import view.LevelTypeView;

public class ChangeLevelTypeController implements ActionListener{
	Model model;
	JPanel panel;
	LevelTypeView typePanel;
	
	public ChangeLevelTypeController(Model m, JPanel p) {
		this.model = m;
		this.panel = p;
		this.typePanel = new LevelTypeView(m);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		panel.setVisible(false);
		typePanel.setVisible(true);
	}
	
}
