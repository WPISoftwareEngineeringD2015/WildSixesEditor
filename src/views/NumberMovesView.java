package views;

import java.awt.Graphics;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.LayoutStyle.ComponentPlacement;

import model.Model;
import controllers.UpdateMoveLimitController;

/**
 * NumberMovesView displays the JSpinner representing the number of moves available in each level
 * @author Alyssa
 *
 */
public class NumberMovesView extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Model model;
	JSpinner moveSpinner;
	
	/**
	 * Constructor for NumberMovesView class
	 * @param m Model for level builder
	 */
	public NumberMovesView(Model m) {
		this.model = m;
		
		moveSpinner = new JSpinner();
		UpdateMoveLimitController updateMoveLimit = new UpdateMoveLimitController(model);
		moveSpinner.addChangeListener(updateMoveLimit);
		
		JLabel label = new JLabel("Number of Moves Allowed");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(label))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(37)
							.addComponent(moveSpinner, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(65, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(label)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(moveSpinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(42, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
	}
	
	/**
	 * Override paintComponent method for NumberMovesView sets value from level template as the value for moveSpinner
	 */
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		moveSpinner.setValue(model.getLevelTemplate().getMoveLimit());
	}
	
	
}
