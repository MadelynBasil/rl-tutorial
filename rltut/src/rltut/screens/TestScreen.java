package rltut.screens;

import java.awt.event.KeyEvent;
import asciiPanel.AsciiPanel;
import rltut.World;
import rltut.WorldBuilder;

public class TestScreen implements Screen {
	private WorldBuilder worldBuilder;
	private World world;
	private boolean iterate;
	
	public TestScreen() {
		createWorldBuilder();
		updateWorld();
	}
	
	private void createWorldBuilder() {
		worldBuilder = new WorldBuilder(80, 21).makeRandomized();
	}
	
	private void updateWorld() {
		world = worldBuilder.build();
	}
	
	public void displayTiles(AsciiPanel terminal) {
		for(int x = 0; x < 80; x++) {
			for(int y = 0; y < 21; y++) {
				terminal.write(world.glyph(x, y), x, y, world.color(x, y));
			}
		}
	}
	
	@Override
	public void displayOutput(AsciiPanel terminal) {
		// Smooth world if choosen
		if(iterate) {
			worldBuilder = worldBuilder.smoothOnce();
			updateWorld();
			iterate = false;
		}
		
		displayTiles(terminal);
		
		terminal.writeCenter("press [escape] to reset or [enter] to smooth world", 22);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		switch (key.getKeyCode()) {
		case KeyEvent.VK_ESCAPE: return new TestScreen();
		case KeyEvent.VK_ENTER:
			iterate = true;
			return this;
		}
		
		return this;
	}

}
