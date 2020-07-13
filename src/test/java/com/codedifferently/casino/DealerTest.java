package com.codedifferently.casino;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class DealerTest {

	@Test

	public void testAddCard() {

		CardDeck testCardDeck = new CardDeck();

		ArrayList<Card> handD = new ArrayList<Card>(); // Dealer's hand
		//ArrayList<Card> handP = new ArrayList<Card>(); // Player's hand

		Dealer testDealer = new Dealer(handD);
		//Player testPlayer = new Player(handP);

		testDealer.addToHand(testCardDeck);

		// Is his hand empty?

		boolean expected = false;
		boolean actual = testDealer.hand.isEmpty();

		Assert.assertEquals(expected, actual);

	}

	@Test

	public void testPlaceCard() {

		CardDeck testCardDeck = new CardDeck();

		ArrayList<Card> handD = new ArrayList<Card>(); // Dealer's hand

		Dealer testDealer = new Dealer(handD);
		

		testDealer.addToHand(testCardDeck);
		
		testDealer.placeCard(0);
		
		//Did he remove the card?
		
		boolean expected = true;
		boolean actual = testDealer.hand.isEmpty();

		Assert.assertEquals(expected, actual);
		
		
	}
	
	@Test
	
	public void givePlayerCard() {
		
		CardDeck testCardDeck = new CardDeck();

		ArrayList<Card> handD = new ArrayList<Card>(); // Dealer's hand
		ArrayList<Card> handP = new ArrayList<Card>(); // Player's hand

		Dealer testDealer = new Dealer(handD);
		Player testPlayer = new Player(handP);
		
		
		//---
		
		Card expectedCard = testCardDeck.getCard(0);

		//Pull a card stright from the deck to the player
		
		testDealer.distributeCard(testPlayer, testCardDeck);
		
		testPlayer.readHand();
		
		Card actualCard = testPlayer.placeCard(0);
		
		Assert.assertEquals(expectedCard, actualCard);
		
		
		
	}

}
