package controllers;

import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
/**
 * UndoableEdits interface defines level builder edits that can be undone and redone
 * @author Alyssa
 *
 */
public interface UndoableEdits extends ActionListener, MouseListener{
	
	public void undo();
	
	public void redo();
	
	public UndoableEdits getPreviousMove();
}
