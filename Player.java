package Zadaci;

public class Player extends GameObject {
	
	public Player(int x, int y, int width, int height) {
		super(x, y, width, height);
		setName (name);
		setHealth (health);
	}
	private String name;
    private int health;

	public String getName() {
		return name;
	}
	
           
	public void setName(String name) {
		this.name = name;
		if (name == null || name.trim().isEmpty()) {
            this.name = "Petar Petrovic";
            
            
            String[] tekst = name.trim().replaceAll("\\s+", " ").split(" ");
            StringBuilder sb = new StringBuilder();
            for (String t : tekst) {
                if (!t.isEmpty()) {
                    sb.append(Character.toUpperCase(t.charAt(0)))
                      .append(t.substring(1).toLowerCase())
                      .append(" ");
                    
		
                }
             }
            
            this.name =sb.toString().trim();
		
		
		
		}
	}

	public Player(String name, int y, int width, int height, int x, int health) {
		super(x, y, width, height);
		this.name = name;
		this.health = health;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
	if (health < 0) this.health = 0;
    else if (health > 100) this.health = 100;
    else this.health = health;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", health=" + health + "]";
	}
}
