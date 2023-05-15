package com.chapter07.cards;

import java.security.SecureRandom;

public class DeckOfCards {
    private Card[] deck;
    private int currentCard;
    private static final int NUMBER_OF_CARDS = 52;
    private static final SecureRandom randomNumbers = new SecureRandom();

    public DeckOfCards() {
        String[] faces = {
                "Ace", "Deuce", "Three", "Four", "Five", "Six",
                "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };

        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
        deck = new Card[NUMBER_OF_CARDS];
        currentCard = 0;

        for (int count = 0; count < deck.length; count++)
            deck[count] = new Card(faces[count % 13], suits[count / 13]);
    }

    public void shuffle()

    {
        // next call to method dealCard should start at deck[0] again
        currentCard = 0;
        // for each Card, pick another random Card (0-51) and swap them
        for (int first = 0; first < deck.length; first++) {
            // select a random number between 0 and 51
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);

            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }

    }

    public Card dealCard()

    {

    // determine whether Cards remain to be dealt

    if (currentCard < deck.length)

    return deck[currentCard++]; // return current Card in array

    else

    return null; // return null to indicate that all Cards were dealt

    }
}
