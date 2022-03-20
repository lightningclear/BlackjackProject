package com.skilldistillery.cards.common;

import com.skilldistillery.cards.blackjack.BlackjackHand;

public class Player {
	protected BlackjackHand hand = new BlackjackHand();

	public void addCard(Card card) {
		System.out.println(card);
		this.hand.addCard(card);
	}

	public void clearHand() {
//		for (int i = 0; i < getHand().size(); i++)
//			getHand().clear();
		hand.clearHand();
	}

	public Hand getHand() {
		return hand;
	}

	@Override
	public String toString() {
		return "Player [hand=" + hand + "]";
	}

	// hitOrStand();
}