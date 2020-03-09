package rltut;

import java.awt.Color;

public class Creature {
	private World world;
	private int xPos;
	private int yPos;
	private Color color;
	private char glyph;
	private CreatureAi ai;
	
	public Creature(World world, Color color, char glyph, CreatureAi ai) {
		this.world = world;
		this.color = color;
		this.glyph = glyph;
		this.ai = ai;
	}
	
	public int getxPos() { return xPos; }
	public int getyPos() { return yPos; }
	public Color getColor() { return color; }
	public char getGlyph() { return glyph; }
	
	public void setxPos(int newxPos) {
		xPos = newxPos;
	}
	public void setyPos(int newyPos) {
		yPos = newyPos;
	}
	
	public void moveBy(int mx, int my) {
		ai.enterTile(xPos + mx, yPos + my, world);
	}
	
	public void dig(int mx, int my) {
		ai.digTile(xPos + mx, yPos + my, world);
	}
}
