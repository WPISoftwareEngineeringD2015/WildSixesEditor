package views;

import java.awt.Graphics;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.LayoutStyle.ComponentPlacement;

import model.Model;

public class MultiplierConstView extends JPanel{
	Model model;
	BuilderPanel panel;
	
	public MultiplierConstView(Model m, BuilderPanel p) {
		this.model = m;
		this.panel = p;
		
		JSlider slider = new JSlider();
		slider.setToolTipText("Select Difficulty\r\n 0 represents the easiest \r\n100 represents the hardest");
		slider.setSnapToTicks(true);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.setMinorTickSpacing(10);
		slider.setMajorTickSpacing(20);
		
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
							.addComponent(slider, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
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
							.addComponent(slider, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(20, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	}
}
