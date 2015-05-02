package model;

import java.io.File;

/**
 * FileIO class maintains file information used for saving and loading files
 * @author alyssagraham
 *
 */
public class FileIO {
	File currentDirectory; 
	File currentFile;
	File defaultFile;
	
	/**
	 * Constructor method for FileIO class
	 */
	public FileIO() {
		this.currentDirectory = new File(System.getProperty("user.home"));
		this.currentFile = null;
		this.defaultFile = new File("newLevel.swLevel");
	}
	
	/**
	 * get method for File currentDirectory
	 * @return File currentDirectory 
	 */
	public File getCurrentDirectory() {
		return this.currentDirectory;
	}
	
	/**
	 * get method for File currentFile
	 * returns the default File if no currentFile is set
	 * @return File currentFile or defaultFile if null
	 */
	public File getCurrentFile() {
		if(currentFile != null) {
			return this.currentFile;
		}
		else {
			return this.defaultFile;
		}
	}
	
	/**
	 * get method for File defaultFile
	 * @return File defaultFile
	 */
	public File getDefaultFile() {
		return this.defaultFile;
	}
	
	/**
	 * set method for File currentFile
	 * @param f File to set currentFile to
	 */
	public void setCurrentFile(File f) {
		this.currentFile = f;
	}
	
}
