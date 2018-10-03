package main;

public class Player implements IPlayer {
	
	private String name;
	private int level = 1;
	private int exp = 0;
	private int hp = 50;
	
	public Player(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public int attack() {
		return RandomHelper.getInt((level+2), (level+(level/2)+2));
	}

	@Override
	public void takeDamage(int damage) {
		hp = hp-damage;
		isDead();
		System.out.println("You take " + damage + " damage. " + hp + " hp left");		
	}

	@Override
	public void giveExp(int newExp) {
		exp = exp+newExp;
		if (exp >= 100) {			
			level++;
			System.out.println("Leveled up to " + level);
			exp = exp-100;
		} else {
			System.out.println("You gained " + newExp + " exp. Current exp = " + exp);
		}		
	}

	@Override
	public boolean isDead() {
		if (hp<0) {
			System.out.println("Dead");
			System.exit(1);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int getHp() {
		return hp;
	}

	@Override
	public int getExp() {
		return exp;
	}

	@Override
	public int getLevel() {
		return level;
	}

}
