package inheritanceEx;

// Notice how we do not need to put the getName() function in this class
// This is because it is inherited from the superclass (Humanoid)

public class Monster extends Humanoid {		// notice the extends keyword
	private int health;
	private boolean dead;
	
	public Monster(String name) {
		super(name);			// this calls the constructor method of the super-class
		health = 20;
		dead = false;
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
}
