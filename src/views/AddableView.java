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

import model.Model;
import model.TileType;
import controller.BlockButtonController;
import controller.NullButtonController;
import controller.NumberButtonController;
import controller.ReleaseButtonController;

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
	
	public AddableView(Model m) {
		this.model = m;
		setLayout(null);
		
		//nullTile
		nullTile = new JPanel();
		nullTile.setLocation(10, 11);
		nullTile.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		nullTile.setSize(61,61);
		nullTile.setBackground(new Color(10));
		add(nullTile);
		nullTile.setLayout(new BorderLayout(0, 0));
		//nullTile.setLayout(new MigLayout("", "[458px]", "[384px]"));
		NullButtonController nullButtonController = new NullButtonController(model, this);
		nullTile.addMouseListener(nullButtonController);
		
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
		ReleaseButtonController releaseButtonController = new ReleaseButtonController(model, this);
		releaseTile.addMouseListener(releaseButtonController);
		
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
		BlockButtonController blockButtonController = new BlockButtonController(model, this);
		sixTile.addMouseListener(blockButtonController);
		
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
		NumberButtonController numberButtonController = new NumberButtonController(model, this);
		numberTile.addMouseListener(numberButtonController);
		
		JLabel label = new JLabel("NUMBER");
		label.setBounds(0, 0, 61, 61);
		numberTile.add(label);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Segoe UI", Font.BOLD, 12));
		//End of numberTile
				
	}
	
	@Override
	public void paintComponents(Graphics g) {
		super.paintComponents(g);
		
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

	
	public JPanel getSixTile() {
		return this.sixTile;
	}
	
	public JPanel getNullTile() {
		return this.nullTile;
	}
	
	public JPanel getReleaseTile() {
		return this.releaseTile;
	}
	
	public JPanel getNumberTile() {
		return this.numberTile;
	}
	
}
