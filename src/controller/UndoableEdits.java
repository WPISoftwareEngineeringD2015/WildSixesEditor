package controller;

import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

public interface UndoableEdits extends ActionListener, MouseListener{
	
	public void undo();
	
	public void redo();
}
