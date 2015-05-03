package controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import kiviuq.entities.LevelTemplate;
import model.Model;
import views.Application;
import views.BoardView;
import views.BuilderPanel;
import views.BuilderView;

public class DeserializeController {
	
	Model model;
	File inputFile;
	
	public DeserializeController(Model m, File f) {
		this.model = m;
		this.inputFile = f;
	}
	
	public void deserialize() {
		LevelTemplate newLT = null;
		
		try
	      {
	         FileInputStream file = new FileInputStream(inputFile.getAbsolutePath());
	         ObjectInputStream in = new ObjectInputStream(file);
	         newLT = (LevelTemplate) in.readObject();
	         in.close();
	         file.close();
	      }
		catch(IOException i) {
	         return;
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
			return;
		}
		
		model.setLevelTemplate(newLT);
		
		//Refresh the view
		BuilderView view = Application.getBuilderView();
		BuilderPanel panel = view.getBuilderPanel();
		BoardView tiles = view.getBuilderPanel().getBoardView();
		tiles.repaint();
		panel.repaint();
	}

}
