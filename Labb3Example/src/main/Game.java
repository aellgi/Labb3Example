package main;

import java.util.Scanner;

import monsters.IMonster;

public class Game {

	// Keeps track of when we should abort main loop
	private boolean lostGame, wonGame;
	// Handles input
	private Scanner sc;
	// Keep track of current player
	private IPlayer player;
	
	/**
	 * Creates a new Game. Start it by calling startGame()
	 */
	public Game() {
		sc = new Scanner(System.in);
	}
	
	public void startGame() {
		System.out.println("************************");
		System.out.println("* Welcome to The Game! *");
		System.out.println("************************");
		System.out.print("Enter your name: ");
		String name = sc.nextLine();
		player = new Player(name);
		
		System.out.println("Your name is " + name);
		
		int input = -1;
		while (!wonGame && !lostGame) {
			printMainMenu();
			System.out.print("> ");
			input = sc.nextInt();
			sc.nextLine();
			switch(input) {
				case 1:
					goAdventure();
					break;
				case 2:
					goCharacter();
					break;
				case 3:
					System.out.println("Bye!");
					lostGame = true;
					break;
			}
		}
		
		if (wonGame) {
			System.out.println("Congratulations! You won The Game!");
		}

	}
	
	/**
	 * Prints all menu options
	 */
	private void printMainMenu() {
		System.out.println("1. Go adventuring");
		System.out.println("2. Show details about your character");
		System.out.println("3. Exit game");
	}
	
	/**
	 * First menu option - fighting monsters
	 */
	private void goAdventure() {
		/* TODO first menu option. May result in:
		 * 1. nothing
		 * 2. battle with random monster
		 * based on randomness
		 */
		if (RandomHelper.getBigChance() == true) {
			if (RandomHelper.get50Chance() == true ) {
				
			}
		} else {
			System.out.println("You see nothing but swaying grass all around you...");			
			pause();
		}
		
	}
	
	/**
	 * Initiates a battle between the player and the given monster
	 * @param monster - the monster to fight
	 */
	private void battle(IMonster monster) {
		/* TODO
		 * simulate a battle.
		 * Must also handle all side effects, like death, leveling up to 10 and so on 
		 */
	}
	
	/**
	 * Second menu option - show details about character
	 */
	private void goCharacter() {
		System.out.println("***********");
		System.out.println("*Name: " + player.getName());
		System.out.println("*HP: " + player.getHp());
		System.out.println("*Level: " + player.getLevel());
		System.out.println("*Exp: " + player.getExp());
		System.out.println("***********");
	}

	/**
	 * Pauses the game, waiting for an enter keypress
	 * Helper method
	 */
	private void pause() {
		System.out.println("[Input key to continue]");
		sc.next();
	}
	
}
