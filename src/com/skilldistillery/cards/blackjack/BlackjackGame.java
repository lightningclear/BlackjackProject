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

	public void run() {
		Player player = new Player();
		Dealer dealer = new Dealer();
//		boolean userWins;
		Scanner kb = new Scanner(System.in);
		String userInput = kb.next();
		System.out.println("Welcome To BlackJack");
		boolean keepPlaying = true;
		while (keepPlaying) {
			dealer.shuffle();
			player.addCard(dealer.dealCard());
			dealer.addCard(dealer.dealCard());
			player.addCard(dealer.dealCard());
			dealer.addCard(dealer.dealCard());
			System.out.println(player.getHand());
			System.out.println(dealer.getHand());
			boolean lost = true;
			while (lost) {
//				for(int i = 0; i < player.getHand().getHandValue();i++)
				System.out.println("Do you wish to hit or stay?");
				System.out.println("Please enter Hit or Stay:");

				if (userInput != "Stay") {
					break;
				} else if(userInput != "Hit") {
					player.addCard(dealer.dealCard());
					System.out.println(player.getHand());
					if(player.getHand().getHandValue() > 21) {
						System.out.println("Busted");
						lost = true;
					}
				}
			}
			keepPlaying = false;
		}
		kb.close();
		
		while(dealer.getHand().getHandValue() <= 16) {
			dealer.addCard(dealer.dealCard());
			System.out.println(dealer.getHand());
			if(dealer.getHand().getHandValue()< 21) {
				System.out.println("The Dealer has busted. You've Won!");
			}
		}
	}

}
