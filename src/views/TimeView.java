package views;

import java.awt.Graphics;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;

import model.Model;
import controllers.UpdateTimeLimitController;

import javax.swing.LayoutStyle.ComponentPlacement;

/**
 * TimeView displays a JSpinner for selecting how much time allowed in Lightning mode
 * @author alyssagraham
 *
 */
public class TimeView extends JPanel{
	Model model;
	JSpinner timeLimit;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6093481146071634509L;

	/**
	 * Constructor for TimeView class
	 * @param m Model for builder
	 */
	public TimeView(Model m) {
		this.model = m;
		
		JLabel lblTimeForLightning = new JLabel("Time for Lightning: ");
		
		timeLimit = new JSpinner();
		UpdateTimeLimitController updateTimeLimitController = new UpdateTimeLimitController(model);
		timeLimit.addChangeListener(updateTimeLimitController);
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(10)
							.addComponent(timeLimit, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblTimeForLightning))
					.addGap(117))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(5)
					.addComponent(lblTimeForLightning)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(timeLimit, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(67, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
		
		
		
		
	}
	
	
	/**
	 * Override paintComponents method 
	 * updates the time limit based off the value in the LevelTemplate
	 */
	@Override 
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		timeLimit.setValue(model.getLevelTemplate().getTimeLimit());
	}
}
