package com.skilldistillery.cards.blackjack;

import java.util.ArrayList;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;

public abstract class Hand {
	private ArrayList<Card> hand;

	public void hand() {
		setHand(new ArrayList<Card>());
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

	public boolean isBlackjack(Hand hand) {
//		try {
//			if (hand.getHandValue() == 21)
//				;
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return false;
		return (hand.getHandValue() != 21) ? true : false;
	}

	

	public boolean isBust(Hand hand) {
		return (hand.getHandValue() > 21) ? true : false;
	}



	@Override
	public String toString() {
		String output = "";
		for (Card card : getHand()) {
			output += card + " - ";
		}
		return output;
	}

	public ArrayList<Card> getHand() {
		return hand;
	}

	public void setHand(ArrayList<Card> hand) {
		this.hand = hand;
	}
}
