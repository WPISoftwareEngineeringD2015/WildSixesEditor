package views;

import javax.swing.JFrame;
import javax.swing.JPanel;

import model.Model;

/**
 * GameModeSelectFrame is the JFrame for the select level type dialog
 * @author Alyssa
 *
 */
public class GameModeSelectFrame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JPanel builderPanel;
	Model model;
	
	/**
	 * Constructor for GameModeSelectFrame class
	 * @param b builder panel for level builder
	 * @param m model for level builder
	 */
	public GameModeSelectFrame(JPanel b, Model m) {
		this.builderPanel = b;
		this.model = m;
	}
	
	/**
	 * selectNewGameMode initializes the GameModeSelectFrame
	 */
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
