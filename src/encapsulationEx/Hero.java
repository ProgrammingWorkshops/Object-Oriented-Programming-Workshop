package encapsulationEx;

class Hero {
	private int damage;
	private String name;
	
	public Hero(String name) {
		this.damage = 1;
		this.name = name;
	}
	
	public int getDamage() {
		return this.damage;
	}
	
	public void setDamage(int amt) {
		this.damage = amt;
	}
	
	public String getName() {
		return this.name;
	}
	
}
