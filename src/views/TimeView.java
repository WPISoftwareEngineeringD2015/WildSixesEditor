package views;

import java.awt.Graphics;

import javax.swing.JPanel;

import model.Model;

public class TimeView extends JPanel{
	Model model;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6093481146071634509L;

	public TimeView(Model m) {
		this.model = m;
		
		
		
		
	}
	
	
	
	@Override 
	public void paintComponents(Graphics g) {
		super.paintComponents(g);
	}
}
