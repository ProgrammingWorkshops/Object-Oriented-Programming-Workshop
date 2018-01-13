package polymorphismEx;

class HeroRPG {

	public static void main(String[] args) {
		Hero hero = new Hero("Martin");
		hero.setDamage(4);
		
		Monster monster = new Monster("Jose");
		monster.setHealth(100);
		
		int combo = 1;
		while(monster.isDead() == false) {
			int dmg = hero.getDamage();
			monster.beAttacked(dmg, combo);
			
			int totalDmg = dmg * combo;
			combo++;
			
			System.out.println(hero.getName() + " did " + totalDmg + " damage to " + monster.getName());
			System.out.println(monster.getName() + "'s health is now " + monster.getHealth());
		}
		
		System.out.println("Our hero " + hero.getName() + " has slain the monster " + monster.getName());
	}
	
}
