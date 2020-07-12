package com.codedifferently.casino;

import org.junit.Assert;
import org.junit.Test;

public class CardTest {

    @Test
    public void constructorTest(){
        //GIVEN
    	Suit givenSuit = Suit.SPADES;
        Rank givenRank = Rank.QUEEN;
        Card cardTest = new Card(givenSuit, givenRank);
        //WHEN
        Suit obtainSuit = cardTest.getSuit();
        Rank obtainRank = cardTest.getRank();
        //THEN
        Assert.assertEquals(givenSuit, obtainSuit);
        Assert.assertEquals(givenRank, obtainRank);
    }

    //SUIT
    @Test
    public void getSuitTest(){
        //GIVEN
        Card cardTest = new Card(Suit.SPADES, Rank.QUEEN);
        //WHEN
        Suit actual = cardTest.getSuit();
        Suit expected = Suit.SPADES;
        //THEN
        Assert.assertEquals(expected, actual);
    }

    //RANK
    @Test
    public void getRankTest(){
    //GIVEN
    Card cardTest = new Card(Suit.DIAMONDS, Rank.SEVEN);
    //WHEN
    Rank expected = cardTest.getRank();
    Rank actual = Rank.SEVEN;
    //THEN
    Assert.assertEquals(expected, actual);
    }
    
}