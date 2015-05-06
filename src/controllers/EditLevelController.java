package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import model.Model;

/**
 * EditLevelController opens dialog to select a previously saved level to edit
 * @author Alyssa
 *
 */
public class EditLevelController implements ActionListener {
	Model model;
	
	/**
	 * Constructor for EditLevelController
	 * @param m Model for level builder
	 */
	public EditLevelController(Model m) {
		this.model = m;
	}

	/**
	 * Override method for actionPerformed 
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		CreateNewLevelController freshLevel = new CreateNewLevelController(model);
		freshLevel.actionPerformed(new ActionEvent(freshLevel, 0, null));
		GetFileLocation getFile = new GetFileLocation(model);
		getFile.getFile();
		File editFile = model.getFiles().getCurrentFile();
		DeserializeController deserialize = new DeserializeController(model, editFile);
		deserialize.deserialize();
	}
	
	

}
