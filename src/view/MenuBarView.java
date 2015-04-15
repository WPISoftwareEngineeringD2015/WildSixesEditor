package view;

import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import model.Model;
import controller.ChangeLevelTypeController;

public class MenuBarView extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6250157798725563642L;
	Model model;

	public MenuBarView(Model m) {
		this.model = m;
		ChangeLevelTypeController editLevelType = new ChangeLevelTypeController(model, this);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 789, 21);
		add(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmSave = new JMenuItem("Save");
		mntmSave.setIcon(new ImageIcon(BuilderPanel.class.getResource("/javax/swing/plaf/metal/icons/ocean/floppy.gif")));
		mnFile.add(mntmSave);
		
		JMenuItem mntmCreateNewLeve = new JMenuItem("Create New Level");
		mntmCreateNewLeve.setIcon(new ImageIcon(BuilderPanel.class.getResource("/javax/swing/plaf/metal/icons/ocean/file.gif")));
		mnFile.add(mntmCreateNewLeve);
		
		JMenuItem mntmEditExistingLevel = new JMenuItem("Edit Existing Level");
		mntmEditExistingLevel.setIcon(new ImageIcon(BuilderPanel.class.getResource("/javax/swing/plaf/metal/icons/ocean/directory.gif")));
		mnFile.add(mntmEditExistingLevel);
		
		JMenu mnNewMenu = new JMenu("Edit");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmEditLevelType = new JMenuItem("Edit Level Type");
		mnNewMenu.add(mntmEditLevelType);
		mntmEditLevelType.addActionListener(editLevelType);
		
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
	}
	
	
	
}
