package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.JPanel;

import view.TileTypeView;

public class TileTypeController implements ActionListener{
	JPanel panel;
	TileTypeView typePanel;
	
	
	public TileTypeController(TileTypeView typeView) {
		this.typePanel = typeView;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getID() == MouseEvent.MOUSE_CLICKED) {
			JToggleButton btn = (JToggleButton) e.getSource();
			if(btn.isSelected())
				if(btn.getText().equals("Null")){
					//TODO SET variable to Null
				}
				else if(btn.getText().equals("Release")){
					//TODO SET VARIABLE TO RELEASE
				}
				else if(btn.getText().equals("Number")){
					//TODO SET VARIABLE TO NUMBER
				}
		}

	}
	
}