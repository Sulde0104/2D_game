package game.entities;

import game.Level.Level;
import game.gfx.Screen;

public abstract class Entity {

	public int x, y;
	protected Level level;
	
	public Entity(Level level) {
		init(level);
	}
	
	public final void init(Level level) {
		this.level = level;
	}
	
	public abstract void tick();
	
	public abstract void render(Screen screen);
}
