package polymorphismEx;

public class Hero extends Humanoid {
	private int damage;
	
	public Hero(String name) {
		super(name);
	}
	
	public int getDamage() {
		return this.damage;
	}
	
	public void setDamage(int amt) {
		this.damage = amt;
	}
	
	// Note: We don't actually need to say the function is overriding b/c Java assumes this
	// 			still I prefer to be more explicit so that my code is easier to understand
	@Override
	public String getName() {		// This method is overriding the Humanoid class's getName() function
		return super.getName().toUpperCase();
	}
}
