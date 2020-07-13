package com.codedifferently.casino;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class PlayerTest {
	
	@Test
	
	public void testAddCard() {
		
		CardDeck testCardDeck = new CardDeck();

		ArrayList<Card> handP = new ArrayList<Card>(); // Player's hand

		Player testPlayer = new Player(handP);

		testPlayer.addToHand(testCardDeck); //Pick up a card

		// Is his hand empty?

		boolean expected = false;
		boolean actual = testPlayer.hand.isEmpty();

		Assert.assertEquals(expected, actual);
	}

	
	@Test

	public void testPlaceCard() {

		CardDeck testCardDeck = new CardDeck();

		ArrayList<Card> handP = new ArrayList<Card>(); // Player's hand

		Dealer testPlayer = new Dealer(handP);
		

		testPlayer.addToHand(testCardDeck);
		
		testPlayer.placeCard(0);
		
		//Did he remove the card?
		
		boolean expected = true;
		boolean actual = testPlayer.hand.isEmpty();

		Assert.assertEquals(expected, actual);
		
		
	}
	
	@Test 
	
	public void testAddToDeck() {
		
		CardDeck testCardDeck = new CardDeck();

		ArrayList<Card> handP = new ArrayList<Card>(); // Player's hand

		Player testPlayer = new Player(handP);
		
		int expectedSize = testCardDeck.getDeckSize();
		
		testPlayer.addToHand(testCardDeck); //Pick a card from deck
		
		testPlayer.addToDeck(0,testCardDeck); //Put it back
		
		int actualSize = testCardDeck.getDeckSize();
		
		Assert.assertEquals(expectedSize, actualSize);
		
	}
}
