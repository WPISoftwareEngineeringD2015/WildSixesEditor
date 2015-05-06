package views;

import javax.swing.JFrame;
import javax.swing.JPanel;

import model.Model;

public class GameModeSelectFrame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JPanel builderPanel;
	Model model;
	
	public GameModeSelectFrame(JPanel b, Model m) {
		this.builderPanel = b;
		this.model = m;
	}
	
	
	public void selectNewGameMode() {
		setSize(200, 400);
		setLocationRelativeTo(builderPanel);
		setAlwaysOnTop(true);
		setResizable(false);
		setVisible(true);
		LevelTypeView levelTypeView = new LevelTypeView(model, this, builderPanel);
		builderPanel.setVisible(false);
		this.add(levelTypeView);
		levelTypeView.setVisible(true);
		
	}
	
	
}
