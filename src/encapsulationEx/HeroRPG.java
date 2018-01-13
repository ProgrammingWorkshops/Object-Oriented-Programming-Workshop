package encapsulationEx;

class HeroRPG {

	public static void main(String[] args) {
		Hero hero = new Hero("Martin");
		hero.setDamage(4);
		
		Monster monster = new Monster("Jose");
		monster.setHealth(20);
		
		while(monster.isDead() == false) {	// while monster is not dead
			int dmg = hero.getDamage();
			monster.beAttacked(dmg);
			
			System.out.println(hero.getName() + " did " + hero.getDamage() + " damage to " + monster.getName());
			System.out.println(monster.getName() + "'s health is now " + monster.getHealth());
		}
		
		System.out.println("Our hero " + hero.getName() + " has slain the monster " + monster.getName());
	}
	
}
