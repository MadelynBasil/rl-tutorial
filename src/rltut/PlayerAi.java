package rltut;

public class PlayerAi extends CreatureAi {
	
	public PlayerAi(Creature creature) {
		super(creature);
	}
	
	public void enterTile(int x, int y, World world) {
	    if (world.getTile(x, y) == Tile.FLOOR){
	        creature.setxPos(x);
	        creature.setyPos(y);
	    } else if (world.getTile(x, y).isDiggable()) {
	        creature.dig(x, y);
	    }
	}
}
