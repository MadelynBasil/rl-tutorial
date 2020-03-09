package rltut;

import java.awt.Color;
import asciiPanel.AsciiPanel;

public enum Tile {
    FLOOR((char)250, AsciiPanel.yellow),
    WALL((char)177, AsciiPanel.yellow),
    BOUNDS('x', AsciiPanel.brightBlack);
	
	private char glyph;
	private Color color;
	
	// Are these getters? I think so
	public char glyph() {
		return glyph;
	}
	
	public Color color() {
		return color;
	}
	
	// Constructor for Tile objects
	Tile(char glyph, Color color) {
		this.glyph = glyph;
		this.color = color;
	}
	
	// If a tile is WALL, it is diggable
	public boolean isDiggable() {
		return this == Tile.WALL;
	}
}
