package com.skilldistillery.cards.blackjack;

import java.util.Scanner;

public class BlackjackGame {
	public static void main(String[] args) {
		boolean userWins;
		Scanner kb = new Scanner(System.in);
		BlackjackGame app = new BlackjackGame();
		app.run();
	}

	public void run() {
		Scanner kb = new Scanner(System.in);
		int userInput = kb.nextInt();
		System.out.println("Welcome To BlackJack");
		
		while() {
			
			Switch(kb.nextInt()){
				case 1: System.out.println("Play a game");
				break;
				case 2: System.out.println("Quit the game");
				break;
			}
		}
	}
}
