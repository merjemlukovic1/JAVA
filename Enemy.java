package Zadaci;

public class Enemy extends GameObject {
	
	private String type;
    private int health;
    private int damage;
    
    

	public Enemy(int x, int y, int width, int height, String type, int health, int damage) {
		super(x, y, width, height);
		setType(type);
	    setHealth(health);
	    setDamage(damage);
	
		
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
        if (type == null || type.trim().isEmpty()) {
            this.type = "Goblin";
        } else {
            this.type = type.trim();
        }
	}


	public int getHealth() {
		return health;
	}



	public void setHealth(int health) {
		if (health < 0) this.health = 0;
        else if (health > 100) this.health = 100;
        else this.health = health;
	}



	public int getDamage() {
		return damage;
	}



	public void setDamage(int damage) {
		if (damage < 0) this.damage = 0;
        else if (damage > 100) this.damage = 100;
        else this.damage = damage;
	}



	@Override
	public String toString() {
		return "Enemy [type=" + type + ", health=" + health + ", damage=" + damage + "]";
	}
	

}
