package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Model;
import views.BuilderPanel;

/**
 * BuilderPanelClose controller controls close button on builder panel
 * @author Alyssa
 *
 */
public class BuilderPanelClose implements ActionListener{
	Model model;
	BuilderPanel panel;
	
	/**
	 * Constructor for BuilderPanelClose
	 * @param m Model for level builder
	 * @param p builder panel for level builder
	 */
	public BuilderPanelClose(Model m, BuilderPanel p) {
		this.model = m;
		this.panel = p;
	}
	
	/**
	 * Override for actionPerformed method for BuilderPanelClose class
	 * Sets panel to not be visible
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		panel.setVisible(false);
	}
	
}
