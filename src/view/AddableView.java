package view;

import java.awt.Font;
import java.awt.Graphics;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;

import model.Model;
import net.miginfocom.swing.MigLayout;

public class AddableView extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4786659923235233366L;

	Model model;
	JPanel nullTile;
	JPanel sixTileile;
	JPanel releaseTile;
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
		add(nullTile);
		nullTile.setLayout(new MigLayout("", "[458px]", "[384px]"));
		
		JLabel lblNull = new JLabel("NULL");
		lblNull.setHorizontalAlignment(SwingConstants.CENTER);
		lblNull.setFont(new Font("Segoe UI", Font.BOLD, 12));
		nullTile.add(lblNull, "cell 0 0,grow");
		//END OF nullTile
		
		//releaseTile
		releaseTile = new JPanel();
		releaseTile.setBounds(10, 83, 61, 61);
		releaseTile.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		add(releaseTile);
		
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
		
		lblSix = new JLabel("SIX");
		lblSix.setHorizontalAlignment(SwingConstants.CENTER);
		lblSix.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblSix.setBounds(0, 0, 61, 61);
		sixTile.add(lblSix);
		//End of sixTile
				
	}
	
	@Override
	public void paintComponents(Graphics g) {
		super.paintComponents(g);
		
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
	
	
	
}
