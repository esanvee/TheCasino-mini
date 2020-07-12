package com.codedifferently.casino;

import java.util.ArrayList;

public class Dealer {
	
	public ArrayList<Card> hand = new ArrayList<Card>();
	

	public Dealer(ArrayList<Card> hand) {

		this.hand = hand;

	}
	
	public static void main (String args[]) {
		
		CardDeck cardDeck = new CardDeck();
		ArrayList<Card> hand = new ArrayList<Card>();
		
		Dealer dealer = new Dealer(hand);
		
		dealer.addToHand(cardDeck);
		dealer.addToHand(cardDeck);
		
		System.out.println(hand.toString());
		
		
		
	}
	
	
	
	
	/*
	 * Pull card from DECK
	 */

	public void addToHand(CardDeck cardDeck) {

		if (cardDeck.getDeckSize() == 0) {

			System.out.println("There's nothing in the deck!");

			return;
		}
		
		Card pulledCard = cardDeck.pullCard();

		this.hand.add(pulledCard);
		

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
	
	public Card readCard(int index) {
		
		return hand.get(index);
		
	}

	/*
	 * //pulls a card from the deck and hands DIRECTLY to the player's hand
	 */

	public void distributeCard(Player player, CardDeck cardDeck) {

		player.addToHand(cardDeck.pullCard());

	}
	
	
	
}