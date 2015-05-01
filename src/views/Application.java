package views;

import javax.swing.JFrame;

import model.Model;

public class Application extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8783797056760495237L;
	Model model;
	static BuilderView builderView;
	BuilderPanel builderPanel;
	AddableView addableView;
	
	
	public Application(Model m) {
		this.model = m;
		initialize();
	}
	
	public void initialize() {
		setTitle("Wild Sixes Level Builder");
		builderView = new BuilderView(model);
		setContentPane(builderView);
		setSize(850, 750);
	}
	
	public static BuilderView getBuilderView() {
		return builderView;
	}
	
}
