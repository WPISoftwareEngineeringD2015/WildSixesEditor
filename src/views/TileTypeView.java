package views;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

import controller.TileTypeController;

public class TileTypeView  extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TileTypeView() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {0};
		gridBagLayout.rowHeights = new int[] {0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0};
		setLayout(gridBagLayout);
		
		TileTypeController controller = new TileTypeController(this);
		
		JToggleButton btnNull = new JToggleButton("Null");
		btnNull.addActionListener(controller);
		
		JLabel lblSelectType = new JLabel("Select Type");
		GridBagConstraints gbc_lblSelectType = new GridBagConstraints();
		gbc_lblSelectType.insets = new Insets(0, 0, 5, 0);
		gbc_lblSelectType.gridx = 1;
		gbc_lblSelectType.gridy = 0;
		add(lblSelectType, gbc_lblSelectType);
		GridBagConstraints gbc_btnNull = new GridBagConstraints();
		gbc_btnNull.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnNull.insets = new Insets(0, 0, 5, 0);
		gbc_btnNull.gridx = 1;
		gbc_btnNull.gridy = 1;
		add(btnNull, gbc_btnNull);
		
		JToggleButton btnRelease = new JToggleButton("Release");
		btnRelease.addActionListener(controller);
		GridBagConstraints gbc_btnRelease = new GridBagConstraints();
		gbc_btnRelease.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnRelease.insets = new Insets(0, 0, 5, 0);
		gbc_btnRelease.gridx = 1;
		gbc_btnRelease.gridy = 2;
		add(btnRelease, gbc_btnRelease);
		
		JToggleButton btnNumber = new JToggleButton("Number");
		btnNumber.addActionListener(controller);
		GridBagConstraints gbc_btnNumber = new GridBagConstraints();
		gbc_btnNumber.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnNumber.gridx = 1;
		gbc_btnNumber.gridy = 3;
		add(btnNumber, gbc_btnNumber);
	}

}
