package com.skilldistillery.cards.common;

import java.util.List;

public class Dealer extends Player {
	private Deck deck = new Deck();

//	public Dealer(Deck deck) {
//		this.deck = deck;
//	}

// dealer has full deck of cards;
	public Dealer() {

	}

	public Card dealCard() {
		return this.deck.dealCard();

	}
	// showDealerHnad
	
	public void shuffle() {
		deck.shuffle();
	}
	// soft 17();

//	@Override
//	public String toString() {
//		return "Dealer [deck=" + deck + "]";
//		List<Card> cards = this.hand.getHand();
//		for(Card card : cards) {
//			
//		}
	}

	
	

