package views;

import javax.swing.JFrame;
import javax.swing.border.BevelBorder;

import model.GameMode;
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
		setSize(800, 750);
		
		//Get the level type and disable/enable the appropriate fields/buttons
		
		GameMode currentMode = model.getLevelTemplate().getGameMode();
		switch(currentMode) {
		
		case Puzzle:
			builderView.getBuilderPanel().getAddableView().getSixTile().setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			builderView.getBuilderPanel().getAddableView().getReleaseTile().setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			break;
		case Elimination:
			
			break;
		case Lightning:
			
			break;
		case Release:
			break;
		
		}
		
		
		
	}
	
	public static BuilderView getBuilderView() {
		return builderView;
	}
	
}
