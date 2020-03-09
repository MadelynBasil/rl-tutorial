package rltut;

public class CreatureAi {
	protected Creature creature;
	
	public CreatureAi(Creature creature) {
		this.creature = creature;
	}
	
	// Moves the creature to the tile at the given position if possible
	public void enterTile(int xPos, int yPos, World world) {}
	// Digs the tile at the given position if possible
	public void digTile(int xPos, int yPos, World world) {}
}
