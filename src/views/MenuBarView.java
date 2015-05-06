package views;

import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import model.Model;
/**
 * MenuBarView is the boundary class for the menu which is static across the level builder
 * @author alyssagraham
 *
 */
import controllers.ChangeLevelTypeController;
import controllers.CreateNewLevelController;
import controllers.EditLevelController;
import controllers.SaveController;

public class MenuBarView extends JPanel{
	/**
	 * 
	 */	
	private static final long serialVersionUID = -6250157798725563642L;
	Model model;
	BuilderPanel panel;

	JMenuItem mntmSave;
	JMenuItem mntmCreateNewLevel;
	JMenuItem mntmEditExistingLevel;
	JMenuItem mntmEditLevelType;
	
	/**
	 * Constructor for the MenuBarView class
	 * @param m Model object for the level builder
	 * @param b BuilderPanel 
	 */
	public MenuBarView(Model m, BuilderPanel b) {
		this.model = m;
		this.panel = b;
		
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 789, 21);
		add(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		mntmSave = new JMenuItem("Save");
		mntmSave.setIcon(new ImageIcon(BuilderPanel.class.getResource("/javax/swing/plaf/metal/icons/ocean/floppy.gif")));
		mnFile.add(mntmSave);
		SaveController saveFile = new SaveController(model, panel);
		mntmSave.addActionListener(saveFile);
		
		mntmCreateNewLevel = new JMenuItem("Create New Level");
		mntmCreateNewLevel.setIcon(new ImageIcon(BuilderPanel.class.getResource("/javax/swing/plaf/metal/icons/ocean/file.gif")));
		mnFile.add(mntmCreateNewLevel);
		CreateNewLevelController createNew = new CreateNewLevelController(model);
		mntmCreateNewLevel.addActionListener(createNew);
		
		mntmEditExistingLevel = new JMenuItem("Edit Existing Level");
		mntmEditExistingLevel.setIcon(new ImageIcon(BuilderPanel.class.getResource("/javax/swing/plaf/metal/icons/ocean/directory.gif")));
		mnFile.add(mntmEditExistingLevel);
		EditLevelController editLevel = new EditLevelController(model);
		mntmEditExistingLevel.addActionListener(editLevel);
		
		JMenu mnNewMenu = new JMenu("Edit");
		menuBar.add(mnNewMenu);
		
		mntmEditLevelType = new JMenuItem("Edit Level Type");
		mnNewMenu.add(mntmEditLevelType);
		ChangeLevelTypeController editLevelType = new ChangeLevelTypeController(panel, model);
		mntmEditLevelType.addActionListener(editLevelType);
		
	}
	
	/**
	 * get method for JMenuItem mntmSave attribute
	 * @return returns  JMenuItem mntmSave (Save button in menu)
	 */
	public JMenuItem getMntmSave() {
		return this.mntmSave;
	}
	
	/**
	 * get method for JMenuItem mntmCreateNewLevel attribute
	 * @return returns JMenuItem mntmCreateNewLevel (Create new level button in menu)
	 */
	public JMenuItem getMntmCreateNewLevel() {
		return this.mntmCreateNewLevel;
	}
	
	/**
	 * get method for JMenuItem mntmEditExistingLevel attribute
	 * @return returns JMenuItem mntmEditExistingLevel (Edit existing level button in menu)
	 */
	public JMenuItem getMntmEditExistingLevel() {
		return this.mntmEditExistingLevel;
	}
	
	/**
	 * get method for JMenuItem mntmEditLevelType attribute
	 * @return returns JMenuItem mntmEditLevelType (Edit level type button in edit menu)
	 */
	public JMenuItem getMntmEditLevelType() {
		return this.mntmEditLevelType;
	}
	
}
