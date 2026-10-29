package Zadaci;

public class Main {

	public static void main(String[] args) {
		
		Player p = new Player("peTar  petrović", 10, 5, 32, 32, 85);
        System.out.println(p);
        
        Enemy goblin = new Enemy(12, 5, 16, 16, "Goblin", 60, 20);
        BossEnemy boss = new BossEnemy(12, 5, 32, 32, "Goblin King", 120, 25);
        
        System.out.println(goblin);
        System.out.println(boss);
		
        
        if (p.intersects(goblin)) {
            System.out.println("Desila se kolizija! Igrač i neprijatelj se dodiruju.");
        } else {
            System.out.println("Nema kolizije. Igrač i neprijatelj su razdvojeni.");
	}
	}

	
	}

