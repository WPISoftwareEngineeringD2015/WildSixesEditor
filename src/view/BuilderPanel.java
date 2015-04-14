package view;

import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JPanel;

import model.Model;
import controller.BuilderPanelClose;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JSlider;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JMenuBar;

public class BuilderPanel extends JPanel {

	Model model;
	JButton btnX;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 266441208898498549L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	public BuilderPanel(Model m) {
		this.model = m;
		BuilderPanelClose closeController = new BuilderPanelClose(model, this);
		setLayout(null);
		
		btnX = new JButton("X");
		btnX.setBounds(707, 33, 45, 23);
		add(btnX);
		btnX.addActionListener(closeController);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(10, 618, 89, 23);
		add(btnBack);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(566, 575, 89, 23);
		add(btnSave);
		
		JButton btnPreview = new JButton("Preview");
		btnPreview.setBounds(663, 576, 89, 23);
		add(btnPreview);
		
		textField = new JTextField();
		textField.setBounds(667, 64, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(667, 95, 86, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(667, 126, 86, 20);
		add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\u2605\u2605\u2605");
		lblNewLabel.setBounds(615, 67, 46, 14);
		add(lblNewLabel);
		
		JLabel label = new JLabel("\u2605\u2605\u2606");
		label.setBounds(615, 98, 46, 14);
		add(label);
		
		JLabel label_1 = new JLabel("\u2605\u2606\u2606");
		label_1.setBounds(615, 129, 46, 14);
		add(label_1);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(621, 184, 29, 20);
		add(spinner);
		
		JLabel lblNumberOfMoves = new JLabel("Number of Moves Allowed");
		lblNumberOfMoves.setBounds(569, 161, 174, 14);
		add(lblNumberOfMoves);
		
		JLabel lblTypePuzzle = new JLabel("Type: Puzzle");
		lblTypePuzzle.setBounds(10, 34, 74, 14);
		add(lblTypePuzzle);
		
		JSlider slider = new JSlider();
		slider.setValue(3);
		slider.setPaintLabels(true);
		slider.setMinimum(1);
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(1);
		slider.setMaximum(5);
		slider.setBounds(561, 494, 200, 26);
		add(slider);
		
		JLabel lblSelectDifficulty = new JLabel("Select Difficulty");
		lblSelectDifficulty.setBounds(597, 463, 110, 14);
		add(lblSelectDifficulty);
		
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
		
		JLabel lblAddableComponents = new JLabel("Addable Components");
		lblAddableComponents.setBounds(582, 209, 150, 14);
		add(lblAddableComponents);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(606, 234, 55, 55);
		add(panel);
		
		JTextPane txtpnNull = new JTextPane();
		txtpnNull.setText("NULL");
		panel.add(txtpnNull);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.GRAY);
		panel_1.setBounds(606, 294, 55, 55);
		add(panel_1);
		
		JTextPane textPane = new JTextPane();
		textPane.setText("6");
		panel_1.add(textPane);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.GRAY);
		panel_2.setBounds(607, 354, 55, 55);
		add(panel_2);
		
		JTextPane txtpnReleaseBasket = new JTextPane();
		txtpnReleaseBasket.setText("Release\r\nBasket");
		panel_2.add(txtpnReleaseBasket);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.GRAY);
		panel_3.setBounds(70, 64, 55, 55);
		add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.GRAY);
		panel_4.setBounds(130, 64, 55, 55);
		add(panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.GRAY);
		panel_5.setBounds(190, 64, 55, 55);
		add(panel_5);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.GRAY);
		panel_6.setBounds(250, 64, 55, 55);
		add(panel_6);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.GRAY);
		panel_7.setBounds(310, 64, 55, 55);
		add(panel_7);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.GRAY);
		panel_8.setBounds(370, 64, 55, 55);
		add(panel_8);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(Color.GRAY);
		panel_9.setBounds(430, 64, 55, 55);
		add(panel_9);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(Color.GRAY);
		panel_10.setBounds(10, 64, 55, 55);
		add(panel_10);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(Color.GRAY);
		panel_11.setBounds(490, 64, 55, 55);
		add(panel_11);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBackground(Color.GRAY);
		panel_12.setBounds(10, 124, 55, 55);
		add(panel_12);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBackground(Color.GRAY);
		panel_13.setBounds(70, 124, 55, 55);
		add(panel_13);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBackground(Color.GRAY);
		panel_14.setBounds(130, 124, 55, 55);
		add(panel_14);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBackground(Color.GRAY);
		panel_15.setBounds(190, 124, 55, 55);
		add(panel_15);
		
		JPanel panel_16 = new JPanel();
		panel_16.setBackground(Color.GRAY);
		panel_16.setBounds(250, 124, 55, 55);
		add(panel_16);
		
		JPanel panel_17 = new JPanel();
		panel_17.setBackground(Color.GRAY);
		panel_17.setBounds(310, 124, 55, 55);
		add(panel_17);
		
		JPanel panel_18 = new JPanel();
		panel_18.setBackground(Color.GRAY);
		panel_18.setBounds(370, 124, 55, 55);
		add(panel_18);
		
		JPanel panel_19 = new JPanel();
		panel_19.setBackground(Color.GRAY);
		panel_19.setBounds(430, 124, 55, 55);
		add(panel_19);
		
		JPanel panel_20 = new JPanel();
		panel_20.setBackground(Color.GRAY);
		panel_20.setBounds(490, 124, 55, 55);
		add(panel_20);
		
		JPanel panel_21 = new JPanel();
		panel_21.setBackground(Color.GRAY);
		panel_21.setBounds(10, 184, 55, 55);
		add(panel_21);
		
		JPanel panel_22 = new JPanel();
		panel_22.setBackground(Color.GRAY);
		panel_22.setBounds(70, 184, 55, 55);
		add(panel_22);
		
		JPanel panel_23 = new JPanel();
		panel_23.setBackground(Color.GRAY);
		panel_23.setBounds(130, 184, 55, 55);
		add(panel_23);
		
		JPanel panel_24 = new JPanel();
		panel_24.setBackground(Color.GRAY);
		panel_24.setBounds(190, 184, 55, 55);
		add(panel_24);
		
		JPanel panel_25 = new JPanel();
		panel_25.setBackground(Color.GRAY);
		panel_25.setBounds(250, 184, 55, 55);
		add(panel_25);
		
		JPanel panel_26 = new JPanel();
		panel_26.setBackground(Color.GRAY);
		panel_26.setBounds(310, 184, 55, 55);
		add(panel_26);
		
		JPanel panel_27 = new JPanel();
		panel_27.setBackground(Color.GRAY);
		panel_27.setBounds(370, 184, 55, 55);
		add(panel_27);
		
		JPanel panel_28 = new JPanel();
		panel_28.setBackground(Color.GRAY);
		panel_28.setBounds(430, 184, 55, 55);
		add(panel_28);
		
		JPanel panel_29 = new JPanel();
		panel_29.setBackground(Color.GRAY);
		panel_29.setBounds(490, 184, 55, 55);
		add(panel_29);
		
		JPanel panel_30 = new JPanel();
		panel_30.setBackground(Color.GRAY);
		panel_30.setBounds(10, 242, 55, 55);
		add(panel_30);
		
		JPanel panel_31 = new JPanel();
		panel_31.setBackground(Color.GRAY);
		panel_31.setBounds(10, 302, 55, 55);
		add(panel_31);
		
		JPanel panel_32 = new JPanel();
		panel_32.setBackground(Color.GRAY);
		panel_32.setBounds(10, 362, 55, 55);
		add(panel_32);
		
		JPanel panel_33 = new JPanel();
		panel_33.setBackground(Color.GRAY);
		panel_33.setBounds(70, 242, 55, 55);
		add(panel_33);
		
		JPanel panel_34 = new JPanel();
		panel_34.setBackground(Color.GRAY);
		panel_34.setBounds(70, 302, 55, 55);
		add(panel_34);
		
		JPanel panel_35 = new JPanel();
		panel_35.setBackground(Color.GRAY);
		panel_35.setBounds(70, 362, 55, 55);
		add(panel_35);
		
		JPanel panel_36 = new JPanel();
		panel_36.setBackground(Color.GRAY);
		panel_36.setBounds(130, 242, 55, 55);
		add(panel_36);
		
		JPanel panel_37 = new JPanel();
		panel_37.setBackground(Color.GRAY);
		panel_37.setBounds(130, 302, 55, 55);
		add(panel_37);
		
		JPanel panel_38 = new JPanel();
		panel_38.setBackground(Color.GRAY);
		panel_38.setBounds(130, 362, 55, 55);
		add(panel_38);
		
		JPanel panel_39 = new JPanel();
		panel_39.setBackground(Color.GRAY);
		panel_39.setBounds(190, 242, 55, 55);
		add(panel_39);
		
		JPanel panel_40 = new JPanel();
		panel_40.setBackground(Color.GRAY);
		panel_40.setBounds(190, 302, 55, 55);
		add(panel_40);
		
		JPanel panel_41 = new JPanel();
		panel_41.setBackground(Color.GRAY);
		panel_41.setBounds(190, 362, 55, 55);
		add(panel_41);
		
		JPanel panel_42 = new JPanel();
		panel_42.setBackground(Color.GRAY);
		panel_42.setBounds(250, 242, 55, 55);
		add(panel_42);
		
		JPanel panel_43 = new JPanel();
		panel_43.setBackground(Color.GRAY);
		panel_43.setBounds(250, 302, 55, 55);
		add(panel_43);
		
		JPanel panel_44 = new JPanel();
		panel_44.setBackground(Color.GRAY);
		panel_44.setBounds(250, 362, 55, 55);
		add(panel_44);
		
		JPanel panel_45 = new JPanel();
		panel_45.setBackground(Color.GRAY);
		panel_45.setBounds(310, 242, 55, 55);
		add(panel_45);
		
		JPanel panel_46 = new JPanel();
		panel_46.setBackground(Color.GRAY);
		panel_46.setBounds(310, 302, 55, 55);
		add(panel_46);
		
		JPanel panel_47 = new JPanel();
		panel_47.setBackground(Color.GRAY);
		panel_47.setBounds(310, 362, 55, 55);
		add(panel_47);
		
		JPanel panel_48 = new JPanel();
		panel_48.setBackground(Color.GRAY);
		panel_48.setBounds(370, 242, 55, 55);
		add(panel_48);
		
		JPanel panel_49 = new JPanel();
		panel_49.setBackground(Color.GRAY);
		panel_49.setBounds(370, 302, 55, 55);
		add(panel_49);
		
		JPanel panel_50 = new JPanel();
		panel_50.setBackground(Color.GRAY);
		panel_50.setBounds(370, 362, 55, 55);
		add(panel_50);
		
		JPanel panel_51 = new JPanel();
		panel_51.setBackground(Color.GRAY);
		panel_51.setBounds(430, 242, 55, 55);
		add(panel_51);
		
		JPanel panel_52 = new JPanel();
		panel_52.setBackground(Color.GRAY);
		panel_52.setBounds(430, 302, 55, 55);
		add(panel_52);
		
		JPanel panel_53 = new JPanel();
		panel_53.setBackground(Color.GRAY);
		panel_53.setBounds(430, 362, 55, 55);
		add(panel_53);
		
		JPanel panel_54 = new JPanel();
		panel_54.setBackground(Color.GRAY);
		panel_54.setBounds(490, 242, 55, 55);
		add(panel_54);
		
		JPanel panel_55 = new JPanel();
		panel_55.setBackground(Color.GRAY);
		panel_55.setBounds(490, 302, 55, 55);
		add(panel_55);
		
		JPanel panel_56 = new JPanel();
		panel_56.setBackground(Color.GRAY);
		panel_56.setBounds(490, 362, 55, 55);
		add(panel_56);
		
		JPanel panel_57 = new JPanel();
		panel_57.setBackground(Color.GRAY);
		panel_57.setBounds(10, 422, 55, 55);
		add(panel_57);
		
		JPanel panel_58 = new JPanel();
		panel_58.setBackground(Color.GRAY);
		panel_58.setBounds(10, 482, 55, 55);
		add(panel_58);
		
		JPanel panel_59 = new JPanel();
		panel_59.setBackground(Color.GRAY);
		panel_59.setBounds(10, 542, 55, 55);
		add(panel_59);
		
		JPanel panel_60 = new JPanel();
		panel_60.setBackground(Color.GRAY);
		panel_60.setBounds(70, 422, 55, 55);
		add(panel_60);
		
		JPanel panel_61 = new JPanel();
		panel_61.setBackground(Color.GRAY);
		panel_61.setBounds(70, 482, 55, 55);
		add(panel_61);
		
		JPanel panel_62 = new JPanel();
		panel_62.setBackground(Color.GRAY);
		panel_62.setBounds(70, 542, 55, 55);
		add(panel_62);
		
		JPanel panel_63 = new JPanel();
		panel_63.setBackground(Color.GRAY);
		panel_63.setBounds(130, 422, 55, 55);
		add(panel_63);
		
		JPanel panel_64 = new JPanel();
		panel_64.setBackground(Color.GRAY);
		panel_64.setBounds(130, 482, 55, 55);
		add(panel_64);
		
		JPanel panel_65 = new JPanel();
		panel_65.setBackground(Color.GRAY);
		panel_65.setBounds(130, 542, 55, 55);
		add(panel_65);
		
		JPanel panel_66 = new JPanel();
		panel_66.setBackground(Color.GRAY);
		panel_66.setBounds(190, 422, 55, 55);
		add(panel_66);
		
		JPanel panel_67 = new JPanel();
		panel_67.setBackground(Color.GRAY);
		panel_67.setBounds(190, 482, 55, 55);
		add(panel_67);
		
		JPanel panel_68 = new JPanel();
		panel_68.setBackground(Color.GRAY);
		panel_68.setBounds(190, 542, 55, 55);
		add(panel_68);
		
		JPanel panel_69 = new JPanel();
		panel_69.setBackground(Color.GRAY);
		panel_69.setBounds(250, 422, 55, 55);
		add(panel_69);
		
		JPanel panel_70 = new JPanel();
		panel_70.setBackground(Color.GRAY);
		panel_70.setBounds(250, 482, 55, 55);
		add(panel_70);
		
		JPanel panel_71 = new JPanel();
		panel_71.setBackground(Color.GRAY);
		panel_71.setBounds(250, 542, 55, 55);
		add(panel_71);
		
		JPanel panel_72 = new JPanel();
		panel_72.setBackground(Color.GRAY);
		panel_72.setBounds(310, 422, 55, 55);
		add(panel_72);
		
		JPanel panel_73 = new JPanel();
		panel_73.setBackground(Color.GRAY);
		panel_73.setBounds(310, 482, 55, 55);
		add(panel_73);
		
		JPanel panel_74 = new JPanel();
		panel_74.setBackground(Color.GRAY);
		panel_74.setBounds(310, 542, 55, 55);
		add(panel_74);
		
		JPanel panel_75 = new JPanel();
		panel_75.setBackground(Color.GRAY);
		panel_75.setBounds(370, 422, 55, 55);
		add(panel_75);
		
		JPanel panel_76 = new JPanel();
		panel_76.setBackground(Color.GRAY);
		panel_76.setBounds(370, 482, 55, 55);
		add(panel_76);
		
		JPanel panel_77 = new JPanel();
		panel_77.setBackground(Color.GRAY);
		panel_77.setBounds(370, 542, 55, 55);
		add(panel_77);
		
		JPanel panel_78 = new JPanel();
		panel_78.setBackground(Color.GRAY);
		panel_78.setBounds(430, 422, 55, 55);
		add(panel_78);
		
		JPanel panel_79 = new JPanel();
		panel_79.setBackground(Color.GRAY);
		panel_79.setBounds(430, 482, 55, 55);
		add(panel_79);
		
		JPanel panel_80 = new JPanel();
		panel_80.setBackground(Color.GRAY);
		panel_80.setBounds(430, 542, 55, 55);
		add(panel_80);
		
		JPanel panel_81 = new JPanel();
		panel_81.setBackground(Color.GRAY);
		panel_81.setBounds(490, 422, 55, 55);
		add(panel_81);
		
		JPanel panel_82 = new JPanel();
		panel_82.setBackground(Color.GRAY);
		panel_82.setBounds(490, 482, 55, 55);
		add(panel_82);
		
		JPanel panel_83 = new JPanel();
		panel_83.setBackground(Color.GRAY);
		panel_83.setBounds(490, 542, 55, 55);
		add(panel_83);
		
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
	}
}
