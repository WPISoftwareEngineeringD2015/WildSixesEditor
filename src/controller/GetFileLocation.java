package controller;

import java.io.File;

import javax.swing.JFileChooser;

import model.Model;

public class GetFileLocation{
	Model model;
	JFileChooser dialog;
	
	public GetFileLocation(Model m) {
		this.model = m;
		this.dialog = new JFileChooser();
	}
	
	
	public File getFile() {
		dialog.setCurrentDirectory(new File(System.getProperty("user.home")));
		if(dialog.showOpenDialog(dialog) == JFileChooser.APPROVE_OPTION) {
			File file = dialog.getSelectedFile();
			System.out.println(file.getAbsolutePath());
			return file;
		}
		
		else {
			return null;
		}
		
	}

}
