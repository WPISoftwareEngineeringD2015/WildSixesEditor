package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Model;
import view.Application;
import view.BuilderPanel;
import view.BuilderView;


public class CreateNewLevelController implements ActionListener {
	Model model;
	
	public CreateNewLevelController(Model m) {
		this.model = m;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		BuilderView view = Application.getBuilderView();
		BuilderPanel panel = view.getBuilderPanel();
		panel.setVisible(true);
	}
	
	
}
