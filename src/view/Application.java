package view;

import javax.swing.JFrame;
import javax.swing.JPanel;

import model.Model;

public class Application extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8783797056760495237L;
	Model model;
	BuilderPanel panel;
	LevelTypeView typePanel;
	
	public Application(Model m) {
		super("Wild Sixes Level Builder");
		this.model = m;
		setSize(800, 750);
		panel = new BuilderPanel(model);
		add(panel);
	}
	
	public JPanel getBuilderPanel() {
		return panel;
	}
	
	public JPanel getTypePanel() {
		return typePanel;
	}
	
}
