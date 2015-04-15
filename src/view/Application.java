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
	MenuBarView menuBar;
	
	public Application(Model m) {
		super("Wild Sixes Level Builder");
		this.model = m;
		setSize(800, 750);
		panel = new BuilderPanel(model);
		menuBar = new MenuBarView(model);
		add(panel);
	}
	
	public JPanel getBuilderPanel() {
		return panel;
	}
	
	public JPanel getTypePanel() {
		return typePanel;
	}
	
	public JPanel getMenu() {
		return menuBar;
	}
}
