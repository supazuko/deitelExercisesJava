package cardGame;

import cardGame.exceptions.InvalidCardValueException;

public class Card {
    private final Suit suit;
    private final int value;

    public Card(Suit suit, int value){
        if (value < 1 || value > 13){
            throw new InvalidCardValueException(value + "is not a valid card value");
        }
        this.value = value;
        this.suit = suit;
    }

    public Suit getSuit() {
        return suit;
    }

    public String getValue() {
        String face = "";

        switch (value){
            case 1 -> face = "Ace";
            case 11 -> face = "Jack";
            case 12 -> face = "Queen";
            case 13 -> face = "King";
            default -> face = ""+value;
        }
        return face;
    }
}

