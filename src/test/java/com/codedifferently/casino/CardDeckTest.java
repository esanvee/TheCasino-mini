package com.codedifferently.casino;

import org.junit.Assert;
import org.junit.Test;
import com.codedifferently.casino.CardDeck;

public class CardDeckTest {
/*
    @Test
    public void constructorTest(){
        CardDeck cardDeckTest = new CardDeck();
    }

    @Test
    public void addCardTest(){
        //GIVEN
        CardDeck cardDeckTest = new CardDeck();
        Card actual = cardDeckTest.addCard();

        Assert.assertEquals(Suit.HEARTS, actual.getSuit());
        Assert.assertEquals(Rank.EIGHT, actual.getRank());

    }
    */

    @Test
    public void getDeckSizeTest(){
        //GIVEN
        CardDeck cardDeckTest = new CardDeck();
        int actual = cardDeckTest.getDeckSize();
        //WHEN
        int expected = 52;
        //THEN
        Assert.assertEquals(expected, actual);
    }

    @Test 
    public void getDeckSizeTest2(){
        //GIVEN
        CardDeck cardDeckTest = new CardDeck();
        int expected = 50;
        
        //WHEN
        cardDeckTest.pullCard();
        cardDeckTest.pullCard();
        
        //THEN
        
        int actual = cardDeckTest.getDeckSize();
        
        Assert.assertEquals(expected, actual);
    }
    
    @Test
    
    public void shuffleTest() {
    	
    	//GIVEN
        CardDeck cardDeckTest = new CardDeck();
        Card expected = cardDeckTest.getCard(0);
        
        //WHEN
        cardDeckTest.shuffle();
        
        Card actual = cardDeckTest.getCard(0); ///check if the card changed/moved
        
        Assert.assertNotEquals(expected, actual);	
    	
    	
    }
    
    
    @Test 
    public void getAddCard(){
        //GIVEN
        CardDeck cardDeckTest = new CardDeck();
        
        Card card1 = new Card(Suit.CLUBS,Rank.ACE);
        Card card2 = new Card(Suit.CLUBS,Rank.ACE);
        
        
        
        //WHEN
        cardDeckTest.addCard(card1);
        cardDeckTest.addCard(card2);
        
        //THEN
        
        int expected = 54;
        int actual = cardDeckTest.getDeckSize();
        
        Assert.assertEquals(expected, actual);
    }
    
    
    
}