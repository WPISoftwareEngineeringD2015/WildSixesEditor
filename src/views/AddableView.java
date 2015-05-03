package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;

import kiviuq.entities.TileType;
import model.Model;
import controllers.AddableButtonsController;
/**
 * AddableView class part of the boundary objects
 * AddableView contains the four "addable" tiles that can be added to levels
 * Changes color of selected TileType to be added to the board
 * @author alyssagraham
 *
 */

public class AddableView extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4786659923235233366L;

	Model model;
	JPanel nullTile;
	JPanel sixTileile;
	JPanel releaseTile;
	JPanel numberTile;
	private JPanel sixTile;
	private JLabel lblSix;
	
	/**
	 * Constructor for AddableView class
	 * @param m - Model object for the builder
	 */
	public AddableView(Model m) {
		this.model = m;
		setLayout(null);
		
		//nullTile
		nullTile = new JPanel();
		nullTile.setLocation(10, 11);
		nullTile.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		nullTile.setSize(61,61);
		//nullTile.setBackground(new Color(10));
		add(nullTile);
		nullTile.setLayout(new BorderLayout(0, 0));
		AddableButtonsController addableNull = new AddableButtonsController(model, this, TileType.Null);
		nullTile.addMouseListener(addableNull);
		
		JLabel lblNull = new JLabel("NULL");
		lblNull.setHorizontalAlignment(SwingConstants.CENTER);
		lblNull.setFont(new Font("Segoe UI", Font.BOLD, 12));
		nullTile.add(lblNull);
		//END OF nullTile
		
		//releaseTile
		releaseTile = new JPanel();
		releaseTile.setBounds(10, 83, 61, 61);
		releaseTile.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		add(releaseTile);
		AddableButtonsController addableRelease = new AddableButtonsController(model, this, TileType.Release);
		releaseTile.addMouseListener(addableRelease);
		
		JLabel lblRelease = new JLabel("RELEASE");
		lblRelease.setHorizontalAlignment(SwingConstants.CENTER);
		lblRelease.setFont(new Font("Segoe UI", Font.BOLD, 12));
		GroupLayout gl_releaseTile = new GroupLayout(releaseTile);
		gl_releaseTile.setHorizontalGroup(
			gl_releaseTile.createParallelGroup(Alignment.LEADING)
				.addComponent(lblRelease, GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
		);
		gl_releaseTile.setVerticalGroup(
			gl_releaseTile.createParallelGroup(Alignment.TRAILING)
				.addComponent(lblRelease, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
		);
		releaseTile.setLayout(gl_releaseTile);
		//END of release Tile
		
		//sixTile
		sixTile = new JPanel();
		sixTile.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		sixTile.setBounds(10, 155, 61, 61);
		add(sixTile);
		sixTile.setLayout(null);
		AddableButtonsController addableBlock = new AddableButtonsController(model, this, TileType.Block);
		sixTile.addMouseListener(addableBlock);
		
		lblSix = new JLabel("SIX");
		lblSix.setHorizontalAlignment(SwingConstants.CENTER);
		lblSix.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblSix.setBounds(0, 0, 61, 61);
		sixTile.add(lblSix);
		// END of SIXTILE
		
		//START OF numberTile
		numberTile = new JPanel();
		numberTile.setLayout(null);
		numberTile.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		numberTile.setBounds(81, 11, 61, 61);
		add(numberTile);
		AddableButtonsController addableNumber = new AddableButtonsController(model, this, TileType.Number);
		numberTile.addMouseListener(addableNumber);
		
		JLabel label = new JLabel("NUMBER");
		label.setBounds(0, 0, 61, 61);
		numberTile.add(label);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Segoe UI", Font.BOLD, 12));
		//End of numberTile
				
	}
	
	/**
	 * Override method for paintComponent
	 * Changes color of currently selected "Addable" Tile
	 */
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		TileType type = model.getBuilderComponents().getCurrentAddable();
		
		switch(type) {
		case Null:
			numberTile.setBackground(new Color(240, 240, 240));
			nullTile.setBackground(new Color(10));
			releaseTile.setBackground(new Color(240, 240, 240));
			sixTile.setBackground(new Color(240, 240, 240));
			break;
			
		case Number:
			numberTile.setBackground(new Color(10));
			nullTile.setBackground(new Color(240, 240, 240));
			releaseTile.setBackground(new Color(240, 240, 240));
			sixTile.setBackground(new Color(240, 240, 240));
			break;
			
		case Release: 
			numberTile.setBackground(new Color(240, 240, 240));
			nullTile.setBackground(new Color(240, 240, 240));
			releaseTile.setBackground(new Color(10));
			sixTile.setBackground(new Color(240, 240, 240));
			break;
			
		case Block:
			numberTile.setBackground(new Color(240, 240, 240));
			nullTile.setBackground(new Color(240, 240, 240));
			releaseTile.setBackground(new Color(240, 240, 240));
			sixTile.setBackground(new Color(10));
			break;
		}
		this.repaint();
	}

	/**
	 * get method for JPanel sixTile
	 * @return JPanel for six tile 
	 */
	public JPanel getSixTile() {
		return this.sixTile;
	}
	
	/**
	 * get method for JPanel nullTile
	 * @return JPanel for nullTile
	 */
	public JPanel getNullTile() {
		return this.nullTile;
	}
	
	/**
	 * get method for JPanel releaseTile
	 * @return JPanel for realeaseTile
	 */
	public JPanel getReleaseTile() {
		return this.releaseTile;
	}
	
	/**
	 * get method for JPanel numberTile
	 * @return JPanel for numberTile 
	 */
	public JPanel getNumberTile() {
		return this.numberTile;
	}
	
}
