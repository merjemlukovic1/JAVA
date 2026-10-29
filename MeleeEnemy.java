package Zadaci;

public class MeleeEnemy extends Enemy {

	public MeleeEnemy(int x, int y, int width, int height, String type, int health, int damage) {
		super(x, y, width, height, type, health, damage);
		
	}

	@Override
	public String toString() {
		return "MeleeEnemy []";
	}

}
