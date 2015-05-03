package views;

import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;

import model.Model;

public class BuilderView extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4991952175738013520L;
	Model model;
	BuilderPanel builderPanel;
	//private static Application builder;

	public BuilderView(Model m, Application builder) {
		this.model = m;
		//BuilderView.builder = builder;
		
		builderPanel = new BuilderPanel(model, builder);
		
		MenuBarView menu = new MenuBarView(model, builderPanel);

		FlowLayout flowLayout = (FlowLayout) menu.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(menu, GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
				.addComponent(builderPanel, GroupLayout.PREFERRED_SIZE, 450, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(menu, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(builderPanel, GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
					.addContainerGap())
		);
		setLayout(groupLayout);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
	}
	
	public BuilderPanel getBuilderPanel() {
		return builderPanel;
	}
	
	public void setBuilderPanel(BuilderPanel newPanel) {
		this.builderPanel = newPanel;
	}
	
}
