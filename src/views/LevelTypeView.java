package views;

import java.awt.Graphics;

import javax.swing.JPanel;

import model.Model;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class LevelTypeView extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Model model;
	
	public LevelTypeView(Model m) {
		this.model = m;
		
		JButton btnBack = new JButton("Back");
		
		
		JButton btnPuzzle = new JButton("Puzzle");
		
		JButton btnLightning = new JButton("Lightning");
		
		JButton btnElimination = new JButton("Elimination");
		
		JButton btnRelease = new JButton("Release");
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
