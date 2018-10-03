package main;

public interface IPlayer {
	
	public String getName();
	/**
	 * Tells the player to attack
	 * @returns the damage of the attack
	 */
	public int attack();

	/**
	 * Tells the player to take damage.
	 * This reduces the player's HP, and may result in him dying
	 * @param damage - amount of hp points to subtract from hp
	 */
	public void takeDamage(int damage);

	/**
	 * Gives the player some experience.
	 * May level up the player, and may result in the player winning the game.
	 * @param newExp - the amount of exp to add to the player
	 */
	public void giveExp(int newExp);
	
	/**
	 * Checks if this player is dead or not.
	 * @return true if dead, false if alive
	 */
	public boolean isDead();

	/**
	 * Returns the current HP of the player
	 */
	public int getHp();

	/**
	 * Returns the current EXP of the player
	 */
	public int getExp();

	/**
	 * Returns the current level of the player
	 */
	public int getLevel();

	
}
