package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import model.Model;

public class EditLevelController implements ActionListener {
	Model model;
	
	public EditLevelController(Model m) {
		this.model = m;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		GetFileLocation getFile = new GetFileLocation(model);
		getFile.getFile();
		File editFile = model.getFiles().getCurrentFile();
		DeserializeController deserialize = new DeserializeController(model, editFile);
		deserialize.deserialize();
	}
	
	

}
