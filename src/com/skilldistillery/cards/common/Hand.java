package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand {
	protected List<Card> hand = new ArrayList<Card>();

	public void addCard(Card card) {
		this.hand.add(card);
//		getHand().add(deck.dealCard());
	}

	public void clear() {
		for (int i = 0; i < getHand().size(); i++)
			getHand().clear();
	}

	public int getHandValue() {
		int value = 0;
		for (Card card : getHand()) {
			value += card.getValue();
		}
		return value;
	}

	public List<Card> getHand() {
		return hand;
	}

	@Override
	public String toString() {
		return "Hand [hand=" + hand + "]";
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}
}
