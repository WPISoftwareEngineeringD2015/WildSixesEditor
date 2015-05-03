package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import model.Model;
import views.BuilderPanel;

public class SaveController implements ActionListener{
	Model model;
	BuilderPanel panel;
	
	public SaveController(Model m, BuilderPanel p) {
		this.model = m;
		this.panel = p;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		GetFileLocation getFile = new GetFileLocation(model);
		getFile.getFile();
		File saveFile = model.getFiles().getCurrentFile();
		SerializeController serialize = new SerializeController(model, saveFile);
		serialize.Save();
		
	}
}
