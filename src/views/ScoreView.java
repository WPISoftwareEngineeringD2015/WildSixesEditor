package views;

import java.awt.Graphics;

import javax.swing.JPanel;

import model.Model;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class ScoreView extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8359277470700123151L;
	Model model;
	JTextField threeStars;
	JTextField twoStars;
	JTextField oneStars;
	
	public ScoreView(Model m) {
		this.model = m;
		
		threeStars = new JTextField();
		threeStars.setColumns(10);
		
		twoStars = new JTextField();
		twoStars.setColumns(10);
		
		oneStars = new JTextField();
		oneStars.setColumns(10);
		
		JLabel label = new JLabel("\u2605\u2605\u2605");
		
		JLabel label_1 = new JLabel("\u2605\u2605\u2606");
		
		JLabel label_2 = new JLabel("\u2605\u2606\u2606");
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
							.addComponent(oneStars, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(302, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGap(1)
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
					.addContainerGap(207, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
		
	}
	
	public void paintComponents(Graphics g) {
		super.paintComponents(g);
		oneStars.setText(Integer.toString(model.getLevelTemplate().getStarCriteria().getPoints1()));
		twoStars.setText(Integer.toString(model.getLevelTemplate().getStarCriteria().getPoints2()));
		threeStars.setText(Integer.toString(model.getLevelTemplate().getStarCriteria().getPoints3()));
	}
	
	public JTextField getThreeStars() {
		return this.threeStars;
	}
	
	public JTextField getTwoStars() {
		return this.twoStars;
	}
	public JTextField getOneStars() {
		return this.oneStars;
	}
	
	
}
