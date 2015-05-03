package controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import kiviuq.entities.LevelTemplate;
import model.Model;

public class SerializeController {

	Model model;
	File writeToFile;
	
	public SerializeController(Model m, File writeToFile) {
		this.model = m;
		this.writeToFile = writeToFile;
	}
	
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
