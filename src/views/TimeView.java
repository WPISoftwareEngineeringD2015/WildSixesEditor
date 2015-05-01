package views;

import java.awt.Graphics;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;

import model.Model;
import controller.UpdateTimeLimitController;
import javax.swing.LayoutStyle.ComponentPlacement;

public class TimeView extends JPanel{
	Model model;
	JSpinner timeLimit;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6093481146071634509L;

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
	
	
	
	@Override 
	public void paintComponents(Graphics g) {
		super.paintComponents(g);
		timeLimit.setValue(model.getLevelTemplate().getTimeLimit());
	}
}
