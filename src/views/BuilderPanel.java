package views;

import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import kiviuq.entities.GameMode;
import model.Model;
import controllers.BuilderPanelClose;
import controllers.PreviewController;
import controllers.SaveController;
import controllers.UndoController;

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
	DifficultyView difficultyView;
	MultiplierConstView multiplierConstView;
	private Application builder;
	JButton btnSave;
	JButton btnPreview;
	JButton btnUndo;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 266441208898498549L;
	
	/**
	 * Constructor method for BuilderPanel
	 * @param m Model object for the builder
	 */
	public BuilderPanel(Model m, Application builder) {
		this.model = m;
		BuilderPanelClose closeController = new BuilderPanelClose(model, this);
		setLayout(null);
		
		btnX = new JButton("X");
		btnX.setBounds(707, 33, 45, 23);
		add(btnX);
		btnX.addActionListener(closeController);
		
		btnSave = new JButton("Save");
		btnSave.setBounds(464, 600, 89, 23);
		add(btnSave);
		SaveController saveFile = new SaveController(model, this);
		btnSave.addActionListener(saveFile);
		
		btnPreview = new JButton("Preview");
		btnPreview.setBounds(365, 600, 89, 23);
		add(btnPreview);
		PreviewController previewController = new PreviewController(model, builder);
		btnPreview.addActionListener(previewController);
		
		btnUndo = new JButton("Undo");
		btnUndo.setBounds(265, 600, 89, 23);
		add(btnUndo);
		UndoController undoController = new UndoController(model);
		btnUndo.addActionListener(undoController);
		
		scores = new ScoreView(model, this);
		scores.setBounds(569, 84, 150, 130);
		add(scores);
		
		//Displays the 9x9 grid of tiles
		board = new BoardView(model);
		board.setBounds(10, 64, 549, 534);
		add(board);
		
		
		levelTypeLabel = new JLabel("Type: Puzzle");
		levelTypeLabel.setBounds(10, 34, 207, 14);
		add(levelTypeLabel);
		
		JLabel lblSelectDifficulty = new JLabel("Select Difficulty");
		lblSelectDifficulty.setBounds(587, 523, 110, 14);
		add(lblSelectDifficulty);
		
		difficultyView = new DifficultyView(model);
		difficultyView.setBounds(566, 538, 290, 60);
		add(difficultyView);
		
		JLabel lblAddableComponents = new JLabel("Addable Components");
		lblAddableComponents.setBounds(569, 275, 150, 14);
		add(lblAddableComponents);
		
		addableComponents = new AddableView(model);
		addableComponents.setBounds(569, 300, 150, 218);
		add(addableComponents);
		
		timeView = new TimeView(model);
		timeView.setBounds(579, 214, 162, 60);
		add(timeView);
		
		numberMovesView = new NumberMovesView(model);
		numberMovesView.setBounds(579, 214, 157, 60);
		add(numberMovesView);
		
		multiplierConstView = new MultiplierConstView(model, this);
		multiplierConstView.setBounds(549, 587, 296, 100);
		add(multiplierConstView);
		
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
		difficultyView.repaint();
		numberMovesView.repaint();
		timeView.repaint();
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
	
	/**
	 * get method for Application builder attribute
	 * @return Application builder
	 */
	public Application getBuilder() {
		return this.builder;
	}
	
	public AddableView getAddableComponents() {
		return this.addableComponents;
	}
	
}
