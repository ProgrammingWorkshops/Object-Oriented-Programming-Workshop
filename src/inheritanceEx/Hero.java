package inheritanceEx;

//Notice how we do not need to put the getName() function in this class
//This is because it is inherited from the superclass (Humanoid)

public class Hero extends Humanoid {		// notice the extends keyword
	private int damage;
	
	public Hero(String name) {
		super(name);			// this calls the constructor method of the super-class
	}
	
	public int getDamage() {
		return this.damage;
	}
	
	public void setDamage(int amt) {
		this.damage = amt;
	}
}
