package heroRPG;

class HeroRPG {

	public static void main(String[] args) {
		Hero hero = new Hero("Martin");
		hero.damage = 4;
		
		Monster monster = new Monster("Jose");
		monster.health = 20;
		
		while(monster.isDead() == false) {	// while monster is not dead
			int dmg = hero.damage;
			monster.beAttacked(dmg);
			
			System.out.println(hero.name + " did " + hero.damage + " damage to " + monster.name);
			System.out.println(monster.name + "'s health is now " + monster.health);
		}
		
		System.out.println("Our hero " + hero.name + " has slain the monster " + monster.name);
	}
	
}
