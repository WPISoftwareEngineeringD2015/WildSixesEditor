package controller;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import model.Model;
import model.TileType;
import views.AddableView;

public class ReleaseButtonController implements MouseListener{
	Model model;
	AddableView view;
	
	public ReleaseButtonController(Model m, AddableView v) {
		this.model = m;
		this.view = v;
	}


	@Override
	public void mouseClicked(MouseEvent arg0) {
		model.getBuilderComponents().setCurrentAddable(TileType.Release);
		view.getNullTile().setBackground(new Color(240, 240, 240));
		view.getNumberTile().setBackground(new Color(240, 240, 240));
		view.getReleaseTile().setBackground(new Color(10));
		view.getSixTile().setBackground(new Color(240, 240, 240));
		view.repaint();
		
	}


	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	
}
