package views;

import java.awt.Graphics;

import javax.swing.JPanel;
import javax.swing.JSlider;

import model.Model;

/**
 * 
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
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	}

}
