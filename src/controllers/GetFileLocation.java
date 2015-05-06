package controllers;

import java.io.File;

import javax.swing.JFileChooser;

import model.Model;


/**
 * GetFileLocation class handles getting files for saving and editing 
 * @author Alyssa
 *
 */
public class GetFileLocation{
	Model model;
	JFileChooser dialog;
	
	public GetFileLocation(Model m) {
		this.model = m;
		this.dialog = new JFileChooser();
	}
	
	/**
	 * getFile method for getting the file path to save or edit 
	 */
	public void getFile() {
		dialog.setCurrentDirectory(new File(System.getProperty("user.home")));
		if(dialog.showSaveDialog(dialog) == JFileChooser.APPROVE_OPTION) {
			File file = dialog.getSelectedFile();
			System.out.println(file.getAbsolutePath());
			//return file;
			model.getFiles().setCurrentFile(file);
		}
		
		else {
			return;
		}
		
	}

}
