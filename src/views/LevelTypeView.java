package views;

import java.awt.Graphics;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;

import kiviuq.entities.GameMode;
import model.Model;
import controller.BackButtonController;
import controller.GameModeButtonsController;

public class LevelTypeView extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Model model;
	JButton btnBack;
	JButton btnPuzzle;
	JButton btnLightning;
	JButton btnElimination;
	JButton btnRelease;
	JFrame selectFrame;
	JPanel builderPanel;
	
	
	public LevelTypeView(Model m, JFrame s, JPanel p) {
		this.model = m;
		this.selectFrame = s;
		this.builderPanel = p;
		
		btnBack = new JButton("Back");
		BackButtonController backButtonController = new BackButtonController(selectFrame, builderPanel);
		btnBack.addActionListener(backButtonController);
		
		btnPuzzle = new JButton("Puzzle");
		GameModeButtonsController puzzleController = new GameModeButtonsController(selectFrame, builderPanel, model, GameMode.Puzzle);
		btnPuzzle.addActionListener(puzzleController);
		
		btnLightning = new JButton("Lightning");
		GameModeButtonsController lightningController = new GameModeButtonsController(selectFrame, builderPanel, model, GameMode.Lightning);
		btnLightning.addActionListener(lightningController);
		
		btnElimination = new JButton("Elimination");
		GameModeButtonsController eliminationController = new GameModeButtonsController(selectFrame, builderPanel, model, GameMode.Elimination);
		btnElimination.addActionListener(eliminationController);
		
		JButton btnRelease = new JButton("Release");
		GameModeButtonsController releaseController = new GameModeButtonsController(selectFrame, builderPanel, model, GameMode.Release);
		btnRelease.addActionListener(releaseController);
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnBack))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(58)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(btnPuzzle)
								.addComponent(btnLightning)
								.addComponent(btnElimination)
								.addComponent(btnRelease))))
					.addContainerGap(303, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addGap(98)
					.addComponent(btnPuzzle)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnLightning)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnElimination)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnRelease)
					.addPreferredGap(ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
					.addComponent(btnBack)
					.addContainerGap())
		);
		setLayout(groupLayout);
	}
	
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	}
	
	
	
	
	
	
	
}
