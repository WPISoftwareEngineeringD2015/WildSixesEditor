package views;

import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;

import model.GameMode;
import model.Model;
import controller.BuilderPanelClose;
import controller.SaveController;

/**
 * BuilderPanel is an aggregate the components related to a particular level that is currently being built by the level builder
 * @author alyssagraham
 *
 */

public class BuilderPanel extends JPanel {

	Model model;
	JButton btnX;
	JLabel levelTypeLabel;
	AddableView addableComponents;
	ScoreView scores;
	BoardView board;
	TimeView timeView;
	NumberMovesView numberMovesView;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 266441208898498549L;
	
	/**
	 * Constructor method for BuilderPanel
	 * @param m Model object for the builder
	 */
	public BuilderPanel(Model m) {
		this.model = m;
		BuilderPanelClose closeController = new BuilderPanelClose(model, this);
		setLayout(null);
		
		btnX = new JButton("X");
		btnX.setBounds(707, 33, 45, 23);
		add(btnX);
		btnX.addActionListener(closeController);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(566, 575, 89, 23);
		add(btnSave);
		SaveController saveFile = new SaveController(model, this);
		btnSave.addActionListener(saveFile);
		
		JButton btnPreview = new JButton("Preview");
		btnPreview.setBounds(663, 576, 89, 23);
		add(btnPreview);
		
		scores = new ScoreView(model);
		scores.setBounds(569, 64, 150, 86);
		add(scores);
		
		//Displays the 9x9 grid of tiles
		board = new BoardView(model);
		board.setBounds(10, 64, 549, 534);
		add(board);
		
		
		levelTypeLabel = new JLabel("Type: Puzzle");
		levelTypeLabel.setBounds(10, 34, 207, 14);
		add(levelTypeLabel);
		
		JSlider slider = new JSlider();
		slider.setValue(3);
		slider.setPaintLabels(true);
		slider.setMinimum(1);
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(1);
		slider.setMaximum(5);
		slider.setBounds(566, 538, 200, 26);
		add(slider);
		
		JLabel lblSelectDifficulty = new JLabel("Select Difficulty");
		lblSelectDifficulty.setBounds(582, 513, 110, 14);
		add(lblSelectDifficulty);
		
		
		
		JLabel lblAddableComponents = new JLabel("Addable Components");
		lblAddableComponents.setBounds(569, 255, 150, 14);
		add(lblAddableComponents);
		
		addableComponents = new AddableView(model);
		addableComponents.setBounds(569, 272, 150, 218);
		add(addableComponents);
		
		timeView = new TimeView(model);
		timeView.setBounds(579, 161, 162, 73);
		add(timeView);
		
		numberMovesView = new NumberMovesView(model);
		numberMovesView.setBounds(584, 158, 157, 76);
		add(numberMovesView);
		
	}
	
	/**
	 * Override method for painting the BuilderPanel
	 * Sets visibility related to the current Game Mode being built
	 */
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		GameMode currentMode = model.getLevelTemplate().getGameMode();
		
		switch(currentMode) {
		
		case Puzzle:
			addableComponents.getReleaseTile().setVisible(false);
			addableComponents.getSixTile().setVisible(false);
			model.getBoard().scrubGrid();
			timeView.setVisible(false);
			numberMovesView.setVisible(false);
			break;
		case Elimination:
			addableComponents.getReleaseTile().setVisible(false);
			addableComponents.getSixTile().setVisible(false);
			model.getBoard().scrubGrid();
			timeView.setVisible(false);
			numberMovesView.setVisible(true);
			break;
		case Lightning:
			addableComponents.getReleaseTile().setVisible(false);
			addableComponents.getSixTile().setVisible(false);
			model.getBoard().scrubGrid();
			timeView.setVisible(true);
			numberMovesView.setVisible(false);
			break;
		case Release:
			addableComponents.getReleaseTile().setVisible(true);
			addableComponents.getSixTile().setVisible(true);
			timeView.setVisible(false);
			numberMovesView.setVisible(false);
			break;
		
		}
		
		levelTypeLabel.setText("Type: ".concat(currentMode.toString()));
		addableComponents.repaint();
		scores.repaint();
	}
	
	
	/**
	 * get method for BoardView board attribute
	 * @return BoardView board
	 */
	public BoardView getBoardView() {
		return this.board;
	}
	
	/**
	 * get method for ScoreView scores attribute
	 * @return ScoreView scores
	 */
	public ScoreView getScoreView() {
		return this.scores;
	}
	
	
}
