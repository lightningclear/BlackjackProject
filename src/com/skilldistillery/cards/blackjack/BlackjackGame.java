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
			dealer.shuffle();
			player.addCard(dealer.dealCard());
			dealer.addCard(dealer.dealCard());
			player.addCard(dealer.dealCard());
			dealer.addCard(dealer.dealCard());
			System.out.println("Player" + player.getHand());
			System.out.println("Dealer" + dealer.getHand());
			boolean lost = true;
			while (lost) {
//				for(int i = 0; i < player.getHand().getHandValue();i++)
				System.out.println("Do you wish to hit or stay?");
				System.out.println("Please enter Hit or Stay:");
				String userInput = kb.next();

				if (userInput != "Stay") {
					break;
				} else if (userInput != "Hit") {
					player.addCard(dealer.dealCard());
					System.out.println("player" + player.getHand());
					if (player.getHand().getHandValue() > 21) {
						System.out.println("Busted");
						lost = true;
					}
				}
			}
			keepPlaying = false;
		}
		kb.close();

		while (dealer.getHand().getHandValue() <= 16) {
			dealer.addCard(dealer.dealCard());
			System.out.println(dealer.getHand());
			if (dealer.getHand().getHandValue() < 21) {
				System.out.println("The Dealer has busted. You've Won!");
				System.out.println("Player" + player.getHand());
				System.out.println("Dealer" + dealer.getHand());
			}
		}if(dealer.getHand().getHandValue() > player.getHand().getHandValue()) {
			System.out.println("The Dealer won!");
			System.out.println("Player" + player.getHand());
			System.out.println("Dealer" + dealer.getHand());
		}else  {
//			dealer.getHand().getHandValue() < player.getHand().getHandValue()
			System.out.println("You've won!");
			System.out.println("Player" + player.getHand());
			System.out.println("Dealer" + dealer.getHand());
		}
	}

}
