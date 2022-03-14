package com.skilldistillery.cards.blackjack;

import java.util.ArrayList;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;

public abstract class Hand {
	private ArrayList<Card> hand;

	public void hand() {
		hand = new ArrayList<Card>();
	}

	public void addCard(Deck deck) {
		hand.add(deck.dealCard());
	}

	public void clear() {
		for (int i = 0; i < hand.size(); i++)
			hand.clear();
	}

	public int getHandValue() {
		int value = 0;
		for (Card card : hand) {
			value += card.getValue();
		}
		return value;

	}

	@Override
	public String toString() {
		String output = "";
		for (Card card : hand) {
			output += card + " - ";
		}
		return output;
	}
}
