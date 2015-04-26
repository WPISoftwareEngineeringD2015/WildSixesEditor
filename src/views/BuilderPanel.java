package views;

import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JSpinner;

import model.Model;
import controller.BuilderPanelClose;
import controller.SaveController;
import controller.UpdateMoveLimitController;

public class BuilderPanel extends JPanel {

	Model model;
	JButton btnX;
	JLabel levelTypeLabel;
	AddableView addableComponents;
	ScoreView scores;
	BoardView board;
	JSpinner moveSpinner;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 266441208898498549L;
	
	public BuilderPanel(Model m) {
		this.model = m;
		BuilderPanelClose closeController = new BuilderPanelClose(model, this);
		setLayout(null);
		
		btnX = new JButton("X");
		btnX.setBounds(707, 33, 45, 23);
		add(btnX);
		btnX.addActionListener(closeController);
		
		
/*		JButton btnBack = new JButton("Back");
		btnBack.setBounds(10, 618, 89, 23);
		add(btnBack);*/
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(566, 575, 89, 23);
		add(btnSave);
		SaveController saveFile = new SaveController(model);
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
		
		
		/*textField = new JTextField();
		textField.setBounds(667, 64, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(667, 95, 86, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(667, 126, 86, 20);
		add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\u2605\u2605\u2605");
		lblNewLabel.setBounds(615, 67, 46, 14);
		add(lblNewLabel);
		
		JLabel label = new JLabel("\u2605\u2605\u2606");
		label.setBounds(615, 98, 46, 14);
		add(label);
		
		JLabel label_1 = new JLabel("\u2605\u2606\u2606");
		label_1.setBounds(615, 129, 46, 14);
		add(label_1);*/
		
		moveSpinner = new JSpinner();
		moveSpinner.setBounds(621, 184, 45, 20);
		moveSpinner.setValue(model.getLevelTemplate().getMoveLimit());
		add(moveSpinner);
		UpdateMoveLimitController updateMoveLimit = new UpdateMoveLimitController(model);
		moveSpinner.addChangeListener(updateMoveLimit);
		
		JLabel lblNumberOfMoves = new JLabel("Number of Moves Allowed");
		lblNumberOfMoves.setBounds(569, 161, 174, 14);
		add(lblNumberOfMoves);
		
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
		slider.setBounds(561, 494, 200, 26);
		add(slider);
		
		JLabel lblSelectDifficulty = new JLabel("Select Difficulty");
		lblSelectDifficulty.setBounds(597, 463, 110, 14);
		add(lblSelectDifficulty);
		
		
		
		JLabel lblAddableComponents = new JLabel("Addable Components");
		lblAddableComponents.setBounds(582, 209, 150, 14);
		add(lblAddableComponents);
		
		addableComponents = new AddableView(model);
		addableComponents.setBounds(582, 220, 150, 232);
		add(addableComponents);
		
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		moveSpinner.setValue(model.getLevelTemplate().getMoveLimit());
		levelTypeLabel.setText("Type: ".concat(model.getLevelTemplate().getGameMode().toString()));
		addableComponents.repaint();
	}
	
	public JLabel getLevelTypeLabel() {
		return this.levelTypeLabel;
	}
	
	public AddableView getAddableView() {
		return this.addableComponents;
	}
	
	public BoardView getBoardView() {
		return this.board;
	}
	
	
}
