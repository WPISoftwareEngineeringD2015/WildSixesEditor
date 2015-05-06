package views;

import java.awt.Graphics;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.LayoutStyle.ComponentPlacement;

import model.Model;
import controllers.UpdateMultiplierConstController;

/**
 * MultiplierConstView displays the slider representing the frequency of multipliers in game
 * @author Alyssa
 *
 */
public class MultiplierConstView extends JPanel{
	Model model;
	BuilderPanel panel;
	JSlider multiplierConst;
	
	/**
	 * Constructor for MultiplierConstView class
	 * @param m Model for level builder
	 * @param p builder panel for level builder
	 */
	public MultiplierConstView(Model m, BuilderPanel p) {
		this.model = m;
		this.panel = p;
		
		multiplierConst = new JSlider();
		UpdateMultiplierConstController updateMultiplierConstController = new UpdateMultiplierConstController(model);
		multiplierConst.addChangeListener(updateMultiplierConstController);
		
		multiplierConst.setToolTipText("Select Multiplier Frequency 100 gives the most x3 multipliers while 0 gives no multipliers");
		multiplierConst.setSnapToTicks(true);
		multiplierConst.setPaintTicks(true);
		multiplierConst.setPaintLabels(true);
		multiplierConst.setMinorTickSpacing(10);
		multiplierConst.setMajorTickSpacing(20);
		
		JLabel lblLess = new JLabel("less");
		
		JLabel lblMore = new JLabel("more");
		
		JLabel lblMultiplierFrequency = new JLabel("Multiplier Frequency");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(21)
							.addComponent(lblLess, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(multiplierConst, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblMore, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(91)
							.addComponent(lblMultiplierFrequency)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblMultiplierFrequency)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(29)
							.addComponent(lblMore))
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblLess)
							.addComponent(multiplierConst, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(20, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	/**
	 * Override paintComponent method for MultiplierConstView class sets slider to actual value in level builder
	 */
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		multiplierConst.setValue(model.getLevelTemplate().getMultConst());
	}
}
