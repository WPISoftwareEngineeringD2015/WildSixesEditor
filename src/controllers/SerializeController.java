package controllers;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import kiviuq.entities.LevelTemplate;
import model.Model;

/**
 * SerializeController class class makes the level template into a binary file
 * @author Alyssa
 *
 */
public class SerializeController {

	Model model;
	File writeToFile;
	
	/**
	 * Constructor for SerializeController class
	 * @param m Model for level builder
	 * @param writeToFile file to save to
	 */
	public SerializeController(Model m, File writeToFile) {
		this.model = m;
		this.writeToFile = writeToFile;
	}
	
	/**
	 * Save method for saving level template to a file
	 */
	public void Save() {
		try {
			LevelTemplate temp = model.getLevelTemplate();
			FileOutputStream fileOut = new FileOutputStream(writeToFile.getAbsolutePath());
			ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
			objectOut.writeObject(temp);
			objectOut.close();
			fileOut.close();
		}catch(IOException error)
		{
			error.printStackTrace();
		}
	}
	
	
}
