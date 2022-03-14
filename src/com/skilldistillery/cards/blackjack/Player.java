package com.skilldistillery.cards.blackjack;

public abstract class Player {
	private Hand hand;
	private String name;
	
	public Player() {
		this.hand = new hand();
		this.name = "";
	}

	public Hand getHand() {
		return hand;
	}

	public void setHand(Hand hand) {
		this.hand = hand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
