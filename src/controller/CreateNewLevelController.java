package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.LevelTemplate;
import model.Model;
import views.Application;
import views.BoardView;
import views.BuilderPanel;
import views.BuilderView;


public class CreateNewLevelController implements ActionListener {
	Model model;
	
	public CreateNewLevelController(Model m) {
		this.model = m;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		LevelTemplate fresh = new LevelTemplate();
		model.setLevelTemplate(fresh);
		/*Application newApp = new Application(model);
		newApp.setVisible(true);*/
		BuilderView view = Application.getBuilderView();
		BuilderPanel panel = view.getBuilderPanel();
		BoardView tiles = view.getBuilderPanel().getBoardView();
		//model.getBoard().emptyTilesOnBoard();
		tiles.repaintTiles();
		panel.setVisible(true);
		
	}
	
}
