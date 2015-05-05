package controllers;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import kiviuq.entities.TileType;
import model.Model;
import views.AddableView;
/**
 * AddableButtonsController updates the selected TileType "addable" tile on the builder 
 * @author alyssagraham
 *
 */

public class AddableButtonsController implements MouseListener{
	Model model;
	AddableView view;
	TileType typeToAdd;

	/**
	 * Constructor for AddableButtonsController class
	 * @param m Model for the builder
	 * @param v AddableView the view the controller operates on
	 * @param t TileType which matches the "addable" JPanel that was selected
	 */
	public AddableButtonsController(Model m, AddableView v, TileType t) {
		this.model = m;
		this.view = v;
		this.typeToAdd = t;
	}


	/**
	 * No action on mouse clicked
	 */
	
	@Override
	public void mouseClicked(MouseEvent arg0) {

	}

	
	/**
	 * No action performed with mouseEnter
	 */
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * No action performed with mouseExit
	 */
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * No action performed with mousePress
	 */
	@Override
	public void mousePressed(MouseEvent arg0) {
		switch(typeToAdd) {
		case Null:
			model.getBuilderComponents().setCurrentAddable(TileType.Null);
			view.getNullTile().setBackground(new Color(10));
			view.getNumberTile().setBackground(new Color(240, 240, 240));
			view.getReleaseTile().setBackground(new Color(240, 240, 240));
			view.getSixTile().setBackground(new Color(240, 240, 240));
			view.repaint();
			break;
		case Number:
			model.getBuilderComponents().setCurrentAddable(TileType.Number);
			view.getNumberTile().setBackground(new Color(10));
			view.getNullTile().setBackground(new Color(240, 240, 240));
			view.getReleaseTile().setBackground(new Color(240, 240, 240));
			view.getSixTile().setBackground(new Color(240, 240, 240));
			view.repaint();
			break;
		case Release:
			model.getBuilderComponents().setCurrentAddable(TileType.Release);
			view.getNullTile().setBackground(new Color(240, 240, 240));
			view.getNumberTile().setBackground(new Color(240, 240, 240));
			view.getReleaseTile().setBackground(new Color(10));
			view.getSixTile().setBackground(new Color(240, 240, 240));
			view.repaint();
			break;
		case Block:
			model.getBuilderComponents().setCurrentAddable(TileType.Block);
			view.getNullTile().setBackground(new Color(240, 240, 240));
			view.getNumberTile().setBackground(new Color(240, 240, 240));
			view.getReleaseTile().setBackground(new Color(240, 240, 240));
			view.getSixTile().setBackground(new Color(10));
			view.repaint();
			break;
		}
	}

	/**
	 * No action performed with mouseRelease
	 */
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	
}
