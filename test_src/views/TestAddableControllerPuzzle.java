package views;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;

import controllers.AddableButtonsController;
import model.Model;
import junit.framework.TestCase;
import kiviuq.entities.GameMode;
import kiviuq.entities.TileType;

public class TestAddableControllerPuzzle extends TestCase {
	Application builder;
	Model m;
	AddableView av;
	BoardView board;
	
	protected void setUp() throws Exception {
		m = new Model();
		m.getLevelTemplate().setGameMode(GameMode.Puzzle);
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

	public void testPlaceNumberTilePuzzle(){
		m.getBuilderComponents().setCurrentAddable(TileType.Number);
		board.tvs[0][0].getTile().setType(m.getBuilderComponents().getCurrentAddable());
		board.repaint();
		assertEquals(board.tvs[0][0].getTile().getType().toString(), "Number");
	}
	
	public void testPlaceNullTilePuzzle(){
		m.getBuilderComponents().setCurrentAddable(TileType.Number);
		board.tvs[0][0].getTile().setType(m.getBuilderComponents().getCurrentAddable());
		board.repaint();
		
		m.getBuilderComponents().setCurrentAddable(TileType.Null);
		board.tvs[0][0].getTile().setType(m.getBuilderComponents().getCurrentAddable());
		board.repaint();
		
		assertEquals(board.tvs[0][0].getTile().getType().toString(), "Null");
	}
	
	public void testAddableViewPuzzle() throws InterruptedException{
		MouseEvent me1 = new MouseEvent(Application.builderView.builderPanel.addableComponents.numberTile, 0, 100, 0, 0, 0, 0, false);
		for(MouseListener ml: Application.builderView.builderPanel.addableComponents.numberTile.getMouseListeners()){
			ml.mousePressed(me1);
			ml.mouseReleased(me1);
		}
		
		MouseEvent me2 = new MouseEvent(Application.builderView.builderPanel.board.tvs[0][0], 0, 100, 0, 0, 0, 0, false);
		for(MouseListener m2: Application.builderView.builderPanel.board.tvs[0][0].getMouseListeners()){
			m2.mousePressed(me2);
			//m2.mouseReleased(me2);
		}
		
		assertEquals(Application.builderView.builderPanel.board.tvs[0][0].tile.getType().toString(), "Number");
		
		AddableButtonsController abc = new AddableButtonsController(m, Application.builderView.builderPanel.addableComponents, TileType.Number);
		Application.builderView.builderPanel.getAddableComponents().getNumberTile().addMouseListener(abc);
		
		MouseEvent me3 = new MouseEvent(Application.builderView.builderPanel.getAddableComponents().getNumberTile(), 0, 100, 0, 0, 0, 0, false);
		for(MouseListener m3: Application.builderView.builderPanel.getAddableComponents().getNumberTile().getMouseListeners()){
			m3.mousePressed(me3);
			m3.mouseReleased(me3);
		}
		
		Thread.sleep(100);
		assertEquals(m.getBuilderComponents().getCurrentAddable().toString(), "Number");
		
		AddableButtonsController abc2 = new AddableButtonsController(m, Application.builderView.builderPanel.addableComponents, TileType.Null);
		Application.builderView.builderPanel.getAddableComponents().getNumberTile().addMouseListener(abc2);
		
		MouseEvent me4 = new MouseEvent(Application.builderView.builderPanel.getAddableComponents().getNumberTile(), 0, 100, 0, 0, 0, 0, false);
		for(MouseListener m4: Application.builderView.builderPanel.getAddableComponents().getNumberTile().getMouseListeners()){
			m4.mousePressed(me4);
			m4.mouseReleased(me4);
		}
		
		Thread.sleep(100);
		assertEquals(m.getBuilderComponents().getCurrentAddable().toString(), "Null");
	}
	
	
}
