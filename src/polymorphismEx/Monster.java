package polymorphismEx;

public class Monster extends Humanoid {
	private int health;
	private boolean dead;
	
	public Monster(String name) {
		super(name);
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
	
	// Notice how this function has the same name as the one above but the parameters are different
	// Also notice that the behavior of the function is different
	public void beAttacked(int damage, int multiplier) {
		this.health -= damage * multiplier;
		if(health <= 0) {
			this.health = 0;
			dead = true;
		}
	}
	
	public boolean isDead() {
		return this.dead;
	}
	
	// Note: We don't actually need to say the function is overriding b/c Java assumes this
	// 			still I prefer to be more explicit so that my code is easier to understand
	@Override
	public String getName() {		// This method is overriding the Humanoid class's getName() function
		return super.getName().toLowerCase();
	}
}
