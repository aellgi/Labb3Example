package monsters;

import main.RandomHelper;

abstract class Monster implements IMonster {

	String name;
	int hp;
	int attack;
	int exp;
	
	public Monster(int hp, int attack, int exp) {
		this.hp = hp;
		this.attack = attack;
		this.exp = exp;
	}
	
	@Override
	public int attack() {
		return RandomHelper.getInt((attack), (attack+(attack/2)));
	}

	@Override
	public void takeDamage(int damage) {
		hp = hp-damage;
		isDead();
		System.out.println(name + " takes " + damage + " damage. " + hp + " hp left");				
	}

	@Override
	public boolean isDead() {
		if (hp<0) {
			System.out.println("You killed the monster! You get: " + exp + " exp");
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getHp() {
		return hp;
	}

	@Override
	public int getExp() {
		return exp;
	}

}
