package encapsulationEx;

public class Monster {
	private int health;
	private String name;
	private boolean dead;
	
	public Monster(String name) {
		this.health = 20;
		this.name = name;
		this.dead = false;
	}
	
	public int getHealth() {
		return this.health;
	}
	
	public void setHealth(int amt) {
		this.health = amt;
	}
	
	public void beAttacked(int damage) {
		this.health -= damage;
		if(health <= 0) {
			this.health = 0;
			dead = true;
		}
	}
	
	public boolean isDead() {
		return this.dead;
	}
	
	public String getName() {
		return this.name;
	}
}
