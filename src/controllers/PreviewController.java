package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import kiviuq.entities.Board;
import kiviuq.views.LevelScreen;
import model.Model;
import views.Application;

/**
 * PreviewController for previewing levels in the level builder
 * @author alyssagraham
 *
 */
public class PreviewController implements ActionListener{
	LevelScreen lvlScreen;
	Model model;
	private JFrame builder;
	
	/**
	 * Constructor for the 
	 * @param m Model object for the builder (aggregate of model objects)
	 * @param p Application object for the builder (aggregate of boundary objects)
	 */
	public PreviewController(Model m, Application p) {
		this.model = m;
		this.builder = p;
	}
	 
	/**
	 * actionPerformed method for PreviewController class opens playable game preview
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		lvlScreen = new LevelScreen(Board.MakeBoardFromTemplate(model.getLevelTemplate(), null), builder);
		builder.setVisible(false);
		lvlScreen.setVisible(true);
	}

	
	
	
}
