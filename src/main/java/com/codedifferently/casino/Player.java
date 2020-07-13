package com.codedifferently.casino;

import java.util.ArrayList;


public class Player {

	public ArrayList<Card> hand;
	

	public static void main(String args[]) {

		ArrayList<Card> hand = new ArrayList<Card>();
		CardDeck cardDeck = new CardDeck();
		
		Player p1 = new Player(hand);

		/// Testing///

		Card testCard = new Card(Suit.HEARTS, Rank.THREE);

		p1.addToHand(testCard);// Add card to hand
		p1.addToHand(cardDeck);// Pull card from deck into hand
		p1.readHand();
		p1.placeCard(0);// Place it down
		p1.placeCard(0);

	}

	public Player(ArrayList<Card> hand) {
	
		this.hand = hand;

	}

	
	
	/*
	 * Pull from the desk and move into hand
	 */
	public void addToHand(CardDeck cardDeck) {

		

		if (cardDeck.getDeckSize() == 0) {

			System.out.println("There's nothing in the deck!");

			return;
		}

		this.hand.add(cardDeck.pullCard());

	}

	
	
	/*
	 * Add a card into hand NOT FROM THE DECK
	 */

	public void addToHand(Card card) {

		this.hand.add(card);

	}

	
	
	/*
	 * Put a card back into the deck directly
	 */
	
	public void addToDeck(int index, CardDeck cardDeck) {

		Card withdrawnCard = hand.remove(index);

		cardDeck.addCard(withdrawnCard);

	}

	
	
	
	/*
	 * Remove the card from hand to place down
	 */
	public Card placeCard(int index) {

		if (hand.isEmpty()) {
			System.out.println("There's nothing in your hand!");
			return null;
		}

		Card placedCard = hand.remove(index);

		return placedCard;
	}
	
	/*
	 * Read the cards the player has
	 */
	
	public void readHand() {
		
		System.out.println(hand.toString());
		
	}
	

}
