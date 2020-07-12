package com.codedifferently.casino;

public class Card {

	public final Suit suit;
	public final Rank rank;

	public Card(Suit suit, Rank rank) {
		this.suit = suit;
		this.rank = rank;
	}

	public static void main(String[] args) {
		// Rank deckRank = Rank.ACE;

		/*
		 * for (Rank deckRank : Rank.values()){ System.out.println(deckRank); } for
		 * (Suit deckSuit : Suit.values()){ System.out.println(deckSuit); }
		 */

		Card test = new Card(Suit.HEARTS, Rank.THREE);

		System.out.println("\n" + test.getRank());
		test.toString();

	}

	public Suit getSuit() {

		return this.suit;
	}

	public Rank getRank() {
		return this.rank;
	}

	@Override

	public String toString() {

		String result = "" + this.getSuit() + this.getRank();

		return result;
	}
}
