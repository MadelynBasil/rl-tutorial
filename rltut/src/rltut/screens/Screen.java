package rltut.screens;

import java.awt.event.KeyEvent;
import asciiPanel.AsciiPanel;

public interface Screen {
	// What the user sees on this screen.
	public void displayOutput(AsciiPanel terminal);
	
	// Recieves and responds to user inputs
	public Screen respondToUserInput(KeyEvent key);
}
