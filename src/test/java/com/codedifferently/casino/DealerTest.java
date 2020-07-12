package com.codedifferently.casino;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DealerTest {
	
	CardDeck testCardDeck;
	Dealer testDealer;
	Player testPlayer;
	
	ArrayList<Card> hand;
	
	@Before
	
	public void initalize() {
		
		CardDeck testCardDeck = new CardDeck();
		
		
		ArrayList<Card> handP = new ArrayList<Card>();
		ArrayList<Card> handD = new ArrayList<Card>();
		
		Dealer testDealer = new Dealer(handD);
		Player testPlayer = new Player(handP);
		
		System.out.println(testCardDeck.getDeckSize());
		System.out.println(testDealer.placeCard(0));
		
	}
	
	@Test
	
	public void testAddCard() {
		
		testDealer.addToHand(testCardDeck);
		System.out.println(testDealer.placeCard(0)); 
		
		//Is his hand empty?
		
		
		boolean expected = true;
		boolean actual = testDealer.hand.isEmpty();
		
		Assert.assertEquals(expected,actual);
		
		
		
		
	}
	

}
