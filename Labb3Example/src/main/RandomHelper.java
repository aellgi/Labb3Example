package main;

import java.util.Random;

public class RandomHelper {
	private static Random rng = new Random();
	
	public static boolean getBigChance() {
		Integer event = rng.nextInt(9);
		
		if (event.intValue() == 0) {
			return false;									
		} else {
			return true;
		}
	}
	public static boolean get50Chance() {		
		Integer event = rng.nextInt(9);
		
		if (event.intValue() <= 4) {
		return false;									
		} else {
			return true;
		}
	}
	public static int getInt(int lower, int upper) {		
		
		return rng.nextInt((upper - lower) + 1) + lower;
	}
}
