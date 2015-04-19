package model;

import java.io.File;

public class FileIO {
	File currentDirectory; 
	File currentFile;
	File defaultFile;
	
	public FileIO() {
		this.currentDirectory = new File(System.getProperty("user.home"));
		this.currentFile = null;
		this.defaultFile = new File("newLevel.swLevel");
	}
	
	public File getCurrentDirectory() {
		return this.currentDirectory;
	}
	
	public File getCurrentFile() {
		return this.currentFile;
	}
	
	public File getDefaultFile() {
		return this.defaultFile;
	}
}
