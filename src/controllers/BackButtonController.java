package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 * BackButtonController class handles going back from level type select screen
 * @author Alyssa
 *
 */
public class BackButtonController implements ActionListener{
	
	JFrame selectFrame;
	JPanel builderPanel;
	
	/**
	 * Constructor method for BackButtonController
	 * @param s current JFrame
	 * @param b JPanel to go back to
	 */
	public BackButtonController(JFrame s, JPanel b) {
		this.selectFrame = s;
		this.builderPanel = b;
	}
	
	/**
	 * Override actionPerformed method sets previous panel to visible and disposes of the current frame
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		this.builderPanel.setVisible(true);
		this.selectFrame.dispose();
	}
}
