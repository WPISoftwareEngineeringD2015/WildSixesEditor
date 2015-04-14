package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Model;
import view.BuilderPanel;

public class BuilderPanelClose implements ActionListener{
	Model model;
	BuilderPanel panel;
	
	public BuilderPanelClose(Model m, BuilderPanel p) {
		this.model = m;
		this.panel = p;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		panel.setVisible(false);
	}
	
}
