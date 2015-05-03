package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import kiviuq.entities.LevelTemplate;
import model.Model;
import views.Application;
import views.BoardView;
import views.BuilderPanel;
import views.BuilderView;

/**
 * CreateNewLevelController called when user request to create a new level in the level builder
 * creates a fresh Level Template and refreshes the builder panel
 * @author alyssagraham
 *
 */

public class CreateNewLevelController implements ActionListener {
	Model model;
	
	/**
	 * Constructor class for CreateNewLevelController
	 * @param m Model object for the application
	 */
	public CreateNewLevelController(Model m) {
		this.model = m;
	}

	/**
	 * actionPerformed Override Method - responsible for creating a new level in the level builder when the "create new level button" is pressed.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		LevelTemplate fresh = new LevelTemplate();
		model.setLevelTemplate(fresh);
		BuilderView view = Application.getBuilderView();
		BuilderPanel panel = view.getBuilderPanel();
		BoardView tiles = view.getBuilderPanel().getBoardView();
		tiles.repaintTiles();
		panel.repaint();
		panel.setVisible(true);
	}
	
}
