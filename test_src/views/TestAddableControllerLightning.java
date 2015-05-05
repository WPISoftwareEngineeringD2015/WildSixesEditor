package views;
package views;

import java.awt.event.WindowEvent;

import model.Model;
import junit.framework.TestCase;
import kiviuq.entities.GameMode;
import kiviuq.entities.TileType;

public class TestAddableControllerLightning extends TestCase {
	Application builder;
	Model m;
	AddableView av;
	BoardView board;
	
	protected void setUp() throws Exception {
		m = new Model();
		m.getLevelTemplate().setGameMode(GameMode.Lightning);
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
	
	public void testPlaceNumberTileLightning(){
		m.getBuilderComponents().setCurrentAddable(TileType.Number);
		board.tvs[0][0].getTile().setType(m.getBuilderComponents().getCurrentAddable());
		board.repaint();
		assertEquals(board.tvs[0][0].getTile().getType().toString(), "Number");
	}
	
	public void testPlaceNullTileLightning(){
		m.getBuilderComponents().setCurrentAddable(TileType.Number);
		board.tvs[0][0].getTile().setType(m.getBuilderComponents().getCurrentAddable());
		board.repaint();
		
		m.getBuilderComponents().setCurrentAddable(TileType.Null);
		board.tvs[0][0].getTile().setType(m.getBuilderComponents().getCurrentAddable());
		board.repaint();
		
		assertEquals(board.tvs[0][0].getTile().getType().toString(), "Null");
	}
	
	
	/*
	public void testPlaceReleaseTileRelease(){
		m.getBuilderComponents().setCurrentAddable(TileType.Release);
		board.tvs[0][0].getTile().setType(m.getBuilderComponents().getCurrentAddable());
		board.repaint();
		assertEquals(board.tvs[0][0].getTile().getType().toString(), "Release");
	}
*/
