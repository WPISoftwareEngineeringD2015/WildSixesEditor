package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import kiviuq.entities.Board;
import kiviuq.views.LevelScreen;
import model.Model;
import views.Application;

public class PreviewController implements ActionListener{
	LevelScreen lvlScreen;
	Model model;
	private JFrame builder;
	
	public PreviewController(Model m, Application p) {
		this.model = m;
		this.builder = p;
	}
	 
	@Override
	public void actionPerformed(ActionEvent arg0) {
		lvlScreen = new LevelScreen(Board.MakeBoardFromTemplate(model.getLevelTemplate()), builder);
		builder.setVisible(false);
		lvlScreen.setVisible(true);
		//System.out.println(name);
	}

	
	
	
}
