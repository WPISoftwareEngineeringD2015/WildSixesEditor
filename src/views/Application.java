package views;

import javax.swing.JFrame;

import model.Model;

/**
 * Application is the main boundary class for the level builder
 * @author Alyssa
 *
 */
public class Application extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8783797056760495237L;
	Model model;
	static BuilderView builderView;
	BuilderPanel builderPanel;
	AddableView addableView;
	
	/**
	 * Constructor for Application class
	 * @param m Model class containing all entity class objects necessary in level builder
	 */
	public Application(Model m) {
		this.model = m;
		initialize();
	}
	
	/**
	 * Initialize method initializes level builder frame and window
	 */
	public void initialize() {
		setTitle("Wild Sixes Level Builder");
		builderView = new BuilderView(model, this);
		setContentPane(builderView);
		setSize(900, 850);
	}
	
	/**
	 * get method for BuilderView builderView attribute
	 * @return BuilderView builderView 
	 */
	public static BuilderView getBuilderView() {
		return builderView;
	}
	
}
