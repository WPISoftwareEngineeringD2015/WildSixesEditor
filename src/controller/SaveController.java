package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import model.Model;

public class SaveController implements ActionListener{
	Model model;
	
	public SaveController(Model m) {
		this.model = m;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		GetFileLocation getFile = new GetFileLocation(model);
		File saveFile = getFile.getFile();
		SerializeController serialize = new SerializeController(model, saveFile);
		serialize.Save();
		
	}
	
	
	
}