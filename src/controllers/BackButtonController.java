package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class BackButtonController implements ActionListener{
	
	JFrame selectFrame;
	JPanel builderPanel;
	
	
	public BackButtonController(JFrame s, JPanel b) {
		this.selectFrame = s;
		this.builderPanel = b;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		this.builderPanel.setVisible(true);
		this.selectFrame.dispose();
	}
	
	

}
