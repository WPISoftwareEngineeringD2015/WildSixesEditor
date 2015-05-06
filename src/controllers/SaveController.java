package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import model.Model;
import views.BuilderPanel;

/**
 * SaveController handles saving the currently being edited level
 * @author Alyssa
 *
 */
public class SaveController implements ActionListener{
	Model model;
	BuilderPanel panel;
	
	/**
	 * Constructor for SaveController 
	 * @param m Model for level builder
	 * @param p builder panel for level builder
	 */
	public SaveController(Model m, BuilderPanel p) {
		this.model = m;
		this.panel = p;
	}

	/**
	 * Override method actionPerformed for SaveController saves level to file
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		GetFileLocation getFile = new GetFileLocation(model);
		getFile.getFile();
		File saveFile = model.getFiles().getCurrentFile();
		SerializeController serialize = new SerializeController(model, saveFile);
		serialize.Save();
		
	}
}
