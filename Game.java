package Zadaci;
import java.util.ArrayList;

public class Game {
	private Player player;
    private ArrayList<Enemy> enemies;
    private ArrayList<String> eventLog;
    
	public Game(Player player, ArrayList<Enemy> enemies, ArrayList<String> eventLog) {
		super();
		this.player = player;
		this.enemies = enemies;
		this.eventLog = eventLog;
	}
	public boolean checkCollision(Player p, Enemy e) {
        return p.intersects(e);

}
	public void decreaseHealth(Player p, Enemy e) {
        int staraSnaga = p.getHealth();
        int steta = e.getDamage();
        
	}
}