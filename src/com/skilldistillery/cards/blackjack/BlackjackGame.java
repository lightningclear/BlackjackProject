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
//		Scanner kb = new Scanner(System.in);
//		int userInput = kb.nextInt();
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
			
			
			keepPlaying = false;
		}
	}
}
