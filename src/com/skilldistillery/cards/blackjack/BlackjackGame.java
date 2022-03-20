package com.skilldistillery.cards.blackjack;

import java.util.Scanner;

import com.skilldistillery.cards.common.Dealer;
import com.skilldistillery.cards.common.Player;

public class BlackjackGame {
	public static void main(String[] args) {
//		Scanner kb = new Scanner(System.in);
		BlackjackGame app = new BlackjackGame();
		app.run();
	}

	private void run() {
		Player player = new Player();
		Dealer dealer = new Dealer();
//		boolean userWins;
		Scanner kb = new Scanner(System.in);
		System.out.println("Welcome To BlackJack");
		boolean keepPlaying = true;
		while (keepPlaying) {
//			keepPlaying = false; // only play one hand
			player.clearHand();
			dealer.clearHand();
			dealer.shuffle();
			player.addCard(dealer.dealCard());
			dealer.addCard(dealer.dealCard());
			player.addCard(dealer.dealCard());
			dealer.addCard(dealer.dealCard());
			System.out.println("Player" + player.getHand());
			System.out.println("Dealer" + dealer.getHand());
			boolean playerInputEnded = false;
			while (!playerInputEnded) {
//				for(int i = 0; i < player.getHand().getHandValue();i++)
				System.out.println("Do you wish to hit or stay?");
				System.out.println("Please enter Hit or Stay:");
				String userInput = kb.next();
//				System.out.println(userInput);

				if (userInput.equalsIgnoreCase("stay")) {
					System.out.println("Player has chosen to stay");
					playerInputEnded = true;
					break;
				} else if (userInput.equalsIgnoreCase("Hit")) {
					System.out.println("Player has chosen to hit");
					player.addCard(dealer.dealCard());
					System.out.println("Player" + player.getHand());
					if (player.getHand().getHandValue() > 21) {
						System.out.println("Busted");
						playerInputEnded = true;
					}
				}
			}
			boolean handEnded = false;

			while (dealer.getHand().getHandValue() <= 16) {
				dealer.addCard(dealer.dealCard());
				System.out.println("Dealer" + dealer.getHand());
				if (dealer.getHand().getHandValue() > 21) {
					System.out.println("The Dealer has busted. You've Won!");
					System.out.println("Player" + player.getHand());
					System.out.println("Dealer" + dealer.getHand());
					handEnded = true;
				}
			}
			if (!handEnded) {
				if (dealer.getHand().getHandValue() >= player.getHand().getHandValue()) {
					System.out.println("The Dealer won!");
					System.out.println("Player" + player.getHand());
					System.out.println("Dealer" + dealer.getHand());
				} else {
					System.out.println("You've won!");
					System.out.println("Player" + player.getHand());
					System.out.println("Dealer" + dealer.getHand());
				}
			}
			System.out.println("Do you wish to keep playing? Yes or No?");

			String response = kb.next();
			if (!response.equalsIgnoreCase("Yes")) {
				keepPlaying = false;
			}

		}
		kb.close();
	}

}