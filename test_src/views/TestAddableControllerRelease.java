package views;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;

import model.Model;
import junit.framework.TestCase;
import kiviuq.entities.GameMode;
import kiviuq.entities.TileType;

public class TestAddableControllerRelease extends TestCase {
	Application builder;
	Model m;
	AddableView av;
	BoardView board;
	
	protected void setUp() throws Exception {
		m = new Model();
		m.getLevelTemplate().setGameMode(GameMode.Release);
		builder = new Application(m);
		builder.setVisible(true);
		av = builder.addableView;
		board = Application.builderView.builderPanel.board;		
		super.setUp();
	}

	protected void tearDown() throws Exception {
		builder.dispatchEvent(new WindowEvent(builder, WindowEvent.WINDOW_CLOSING));
		super.tearDown();
	}
	
	public void testPlaceNumberTileRelease(){
		m.getBuilderComponents().setCurrentAddable(TileType.Number);
		board.tvs[0][0].getTile().setType(m.getBuilderComponents().getCurrentAddable());
		board.repaint();
		assertEquals(board.tvs[0][0].getTile().getType().toString(), "Number");
	}
	
	public void testPlaceNullTileRelease(){
		m.getBuilderComponents().setCurrentAddable(TileType.Number);
		board.tvs[0][0].getTile().setType(m.getBuilderComponents().getCurrentAddable());
		board.repaint();
		
		m.getBuilderComponents().setCurrentAddable(TileType.Null);
		board.tvs[0][0].getTile().setType(m.getBuilderComponents().getCurrentAddable());
		board.repaint();
		
		assertEquals(board.tvs[0][0].getTile().getType().toString(), "Null");
	}
	
	public void testPlaceReleaseTileRelease(){
		m.getBuilderComponents().setCurrentAddable(TileType.Release);
		board.tvs[0][0].getTile().setType(m.getBuilderComponents().getCurrentAddable());
		board.repaint();
		assertEquals(board.tvs[0][0].getTile().getType().toString(), "Release");
	}

	
	public void testChangeToReleaseGUI() throws InterruptedException{
		MouseEvent me1 = new MouseEvent(Application.builderView.menu.getMntmEditLevelType(), 0, 100, 0, 0, 0, 0, false);
		for(MouseListener ml: Application.builderView.menu.getMntmEditLevelType().getMouseListeners()){
			ml.mouseClicked(me1);
		}
		
		Thread.sleep(100);
		LevelTypeView ltv = new LevelTypeView(m, builder, Application.builderView);
		assertTrue(ltv.isVisible());
		
		MouseEvent me2 = new MouseEvent(ltv.getBtnRelease(), 0, 100, 0, 0, 0, 0, false);
		for(MouseListener m2: ltv.getBtnRelease().getMouseListeners()){
			m2.mousePressed(me2);
			m2.mouseReleased(me2);
		}
		
		Thread.sleep(100);
		assertEquals(m.getLevelTemplate().getGameMode().toString(), "Release");
		
	}
	
}
