package views;

import java.awt.Graphics;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

import model.Model;
import controllers.UpdateStarCriteria;

/**
 * ScoreView class part of the boundary objects
 * ScoreView shows three JTextFields for the three different star levels
 * Allows the user to update the star criteria for the level being built
 * @author alyssagraham
 *
 */

public class ScoreView extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8359277470700123151L;
	Model model;
	JTextField threeStars;
	JTextField twoStars;
	JTextField oneStars;
	BuilderPanel panel;
	
	
	/**
	 * Constructor for ScoreView class
	 * @param m Model object for builder
	 */
	public ScoreView(Model m, BuilderPanel p) {
		this.model = m;
		this.panel = p;
		
		threeStars = new JTextField();
		threeStars.setColumns(10);
		
		twoStars = new JTextField();
		twoStars.setColumns(10);
		
		oneStars = new JTextField();
		oneStars.setColumns(10);
		
		JLabel label = new JLabel("\u2605\u2605\u2605");
		
		JLabel label_1 = new JLabel("\u2605\u2605\u2606");
		
		JLabel label_2 = new JLabel("\u2605\u2606\u2606");
		
		JButton btnUpdate = new JButton("Update");
		UpdateStarCriteria updateStarCriteria = new UpdateStarCriteria(model, panel);
		btnUpdate.addActionListener(updateStarCriteria);
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(label)
							.addGap(6)
							.addComponent(threeStars, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(label_1)
							.addGap(6)
							.addComponent(twoStars, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(label_2)
							.addGap(6)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(btnUpdate)
								.addComponent(oneStars, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(316, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(label))
						.addComponent(threeStars, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(label_1))
						.addComponent(twoStars, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(label_2))
						.addComponent(oneStars, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnUpdate)
					.addContainerGap(178, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
		
	}
	
	/**
	 * Override method paintComponent for ScoreView class
	 * Updates JTextFields for Star criteria with the current values in the levelTemplate
	 */
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		oneStars.setText(Integer.toString(model.getLevelTemplate().getStarCriteria().getPoints1()));
		twoStars.setText(Integer.toString(model.getLevelTemplate().getStarCriteria().getPoints2()));
		threeStars.setText(Integer.toString(model.getLevelTemplate().getStarCriteria().getPoints3()));
	}
	
	/**
	 * get method for JTextField threeStars
	 * @return JTextField threeStars
	 */
	public JTextField getThreeStars() {
		return this.threeStars;
	}
	
	/**
	 * get method for JTextField twoStars
	 * @return JTextField twoStars
	 */
	public JTextField getTwoStars() {
		return this.twoStars;
	}
	
	/**
	 * get method for JTextField oneStars
	 * @return JTextField oneStars
	 */
	public JTextField getOneStars() {
		return this.oneStars;
	}
}
