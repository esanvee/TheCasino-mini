package com.codedifferently.casino;

import java.util.ArrayList;
import java.util.Collections;

public class CardDeck {

	public ArrayList<Card> cardDeck = new ArrayList<Card>();

	public CardDeck() {

		for (Rank deckRank : Rank.values()) {
			for (Suit deckSuit : Suit.values()) {

				Card card = new Card(deckSuit, deckRank);
				System.out.println("\n" + card.getSuit() + card.getRank());

				cardDeck.add(card);

			}
		}
	}

	public void shuffle() {

		Collections.shuffle(cardDeck);
	}

	public int getDeckSize() {

		return cardDeck.size();
	}

	public void addCard(Card card) {

		this.cardDeck.add(card);
	}
	
	
///Important! Read card!
	
	public Card getCard(int index) {

		return this.cardDeck.get(index);
	}
	
	
	
	

	/*
	 * //Remove and return the TOP card from the deck
	 */
	public Card pullCard() {

		if (this.cardDeck.isEmpty()) {

			System.out.println("There's nothing in the deck!");

			return null;
		}

		Card pulledCard = this.cardDeck.remove(0);

		return pulledCard;
	}
}