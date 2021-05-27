package whotCardGame;

import whotCardGame.WhotSuits;
import whotCardGame.exceptions.InvalidCardValueException;

import static whotCardGame.WhotSuits.*;

public class WhotCard {
    private final WhotSuits suit;
    private final int value;

    private WhotCard(WhotSuits suit, int value){
        this.value = value;
        this.suit = suit;
    }

    public static WhotCard createTriangleCardsWithValues(int value) {
        return new WhotCard(TRIANGLE, value);
    }

    public static WhotCard createSquareCardsWithValues(int value) {
        return new WhotCard(SQUARE, value);
    }

    public static WhotCard createCircleCardsWithValues(int value) {
        return new WhotCard(CIRCLE, value);
    }

    public static WhotCard createCrossCardsWithValues(int value) {
        return new WhotCard(CROSS, value);
    }

    public static WhotCard createStarCardsWithValues(int value) {
        return new WhotCard(STAR, value);
    }

    public static WhotCard createWhotCardsWithValues(int value) {
        return new WhotCard(WHOT, value);
    }

    public WhotSuits getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return value + " Of " + suit.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if(!this.getClass().equals(obj.getClass())){
            return false;
        }
        WhotCard cardToCompare = (WhotCard) obj;
        return this.value == cardToCompare.value || this.suit == cardToCompare.suit;
//        return super.equals(obj);
    }
}

