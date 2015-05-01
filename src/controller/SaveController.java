package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JTextField;

import model.Model;
import views.BuilderPanel;

public class SaveController implements ActionListener{
	Model model;
	BuilderPanel panel;
	int oneStarValue;
	int twoStarValue;
	int threeStarValue;
	
	public SaveController(Model m, BuilderPanel p) {
		this.model = m;
		this.panel = p;
		this.oneStarValue = 0;
		this.twoStarValue = 0;
		this.threeStarValue = 0;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		// Update Scores from textFields
		JTextField oneStar = panel.getScoreView().getOneStars();
		JTextField twoStar = panel.getScoreView().getTwoStars();
		JTextField threeStar = panel.getScoreView().getThreeStars();
		
		if(oneStar.getText() != null) {
			oneStarValue = Integer.parseInt(oneStar.getText());
		}
		
		if(twoStar.getText() != null) {
			twoStarValue = Integer.parseInt(twoStar.getText());
		}
		
		if(threeStar.getText() != null) {
			threeStarValue = Integer.parseInt(threeStar.getText());
		}
		
		
		model.getLevelTemplate().getStarCriteria().setPoints1(oneStarValue);
		model.getLevelTemplate().getStarCriteria().setPoints2(twoStarValue);
		model.getLevelTemplate().getStarCriteria().setPoints3(threeStarValue);
		
		GetFileLocation getFile = new GetFileLocation(model);
		getFile.getFile();
		File saveFile = model.getFiles().getCurrentFile();
		SerializeController serialize = new SerializeController(model, saveFile);
		serialize.Save();
		
	}
	
	
	
}
