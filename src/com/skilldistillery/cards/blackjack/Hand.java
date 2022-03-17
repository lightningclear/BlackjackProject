package com.skilldistillery.cards.blackjack;

import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;

public abstract class Hand {
	private List<Card> hand;

	public void hand() {
	}

	public void addCard(Deck deck) {
		getHand().add(deck.dealCard());
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

//	@Override
//	public String toString() {
//		String output = "";
//		for (Card card : getHand()) {
//			output += card + " - ";
//		}
//		return output;
//	}

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
