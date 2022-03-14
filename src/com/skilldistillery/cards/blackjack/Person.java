package com.skilldistillery.cards.blackjack;

public class Person {
	private Hand hand;
	private String name;
	
	public Person() {
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

}
