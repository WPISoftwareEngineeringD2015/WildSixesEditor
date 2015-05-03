package views;

import java.awt.Graphics;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.LayoutStyle.ComponentPlacement;

import model.Model;
import controllers.UpdateDifficultyController;

/**
 * Displays slider representing difficulty on BuilderPanel
 * @author alyssagraham
 *
 */

public class DifficultyView extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Model model;
	JSlider difficulty;
	
	/**
	 * Constructor for DifficultyView class
	 * @param m Model for builder
	 */
	public DifficultyView(Model m) {
		this.model = m;
		
		difficulty = new JSlider();
		UpdateDifficultyController updateDifficultyController = new UpdateDifficultyController(model);
		difficulty.addChangeListener(updateDifficultyController);
		difficulty.setToolTipText("Select Difficulty\r\n 0 represents the easiest \r\n100 represents the hardest");
		difficulty.setSnapToTicks(true);
		difficulty.setMajorTickSpacing(20);
		difficulty.setPaintLabels(true);
		difficulty.setPaintTicks(true);
		difficulty.setMinorTickSpacing(10);
		
		JLabel lblEasier = new JLabel("easy");
		
		JLabel lblHarder = new JLabel("difficult");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblEasier)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(difficulty, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblHarder, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(107, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(difficulty, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblEasier)
						.addComponent(lblHarder))
					.addContainerGap(23, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
	}
	
	/**
	 * paintComponent method for difficultyView
	 */
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		difficulty.setValue(model.getLevelTemplate().getProbConst());
		
	}
}
