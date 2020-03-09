package rltut;

import java.awt.Color;

public class World {
    private Tile[][] tiles;
    private int width;
    private int height;
    
    public World(Tile[][] tiles){
        this.tiles = tiles;
        this.width = tiles.length;
        this.height = tiles[0].length;
    }
    
    // Getters
    public int getWidth() { return width; }
    public int getHeight() { return height; }
    
    // Returns a specific Tile object from the world
    public Tile getTile(int x, int y) {
    	if (x < 0 || x >= width || y < 0 || y >= height)
    		// If out of the world bounds,
    		// returns the out of bounds Tile type
    		return Tile.BOUNDS;
    	else
    		return tiles[x][y];
    }
    
    // Functions to return attributes of Tiles
    public char glyph(int x, int y) {
    	return tiles[x][y].glyph();
    }
    public Color color(int x, int y) {
    	return tiles[x][y].color();
    }
}
