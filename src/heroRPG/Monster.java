package heroRPG;

class Monster {
	int health;
	String name;
	boolean dead;
	
	Monster(String name) {
		health = 20;
		this.name = name;
		dead = false;
	}
	
	void beAttacked(int damage) {
		this.health -= damage;
		if(health <= 0) {
			this.health = 0;
			dead = true;
		}
	}
	
	boolean isDead() {
		return this.dead;
	}
}
