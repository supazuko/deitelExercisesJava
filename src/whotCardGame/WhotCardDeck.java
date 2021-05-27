package whotCardGame;

import whotCardGame.WhotCard;
import whotCardGame.exceptions.StackOverflowException;
import whotCardGame.exceptions.StackUnderflowException;

import java.security.SecureRandom;

public class WhotCardDeck {
    private static int lastPushLocation = -1;
    private static WhotCard[] cards;

    public WhotCardDeck(int numberOfCards) {
        cards = new WhotCard[numberOfCards];
    }

    public static int getSize() {
        return cards.length;
    }

    public static void push(WhotCard card) {
        if (isFull()) throw new StackOverflowException("Card deck is full");
        lastPushLocation++;
        cards[lastPushLocation] = card;
    }

    public WhotCard peek() {
        if (isEmpty()) throw new StackUnderflowException("Card deck is empty");
        return cards[lastPushLocation];
    }

    public WhotCard pop() {
        if (isEmpty()) throw new StackUnderflowException("Card deck is empty");
        return cards[lastPushLocation--];
    }

    public boolean isEmpty() {
        return lastPushLocation == -1;
    }

    public static boolean isFull() {
        return lastPushLocation == getSize()-1;
    }

    public void shuffle() {
        WhotCard temp;
        SecureRandom random = new SecureRandom();
        for (int i = cards.length - 1; i > 0; i--) {
            int index = random.nextInt(cards.length);
            temp = cards[index];
            cards[index] = cards[i];
            cards[i] = temp;
        }
//        Collections.shuffle(Arrays.asList(cards));
    }

    public static WhotCardDeck cardDeckCanBeFilled() {
        WhotCardDeck cardDeck = new WhotCardDeck(54);
        for(WhotSuits whotSuits: WhotSuits.values()) {
            switch (whotSuits) {
                case STAR -> {
                    for(int counter = 1; counter <= 8; counter++) {
                        if(counter == 6) continue;
                        push(WhotCard.createStarCardsWithValues(counter));
                    }
                }
                case CIRCLE -> {
                    for(int counter = 1; counter <= 14; counter++) {
                        if(counter == 6 || counter == 9) continue;
                        push(WhotCard.createCircleCardsWithValues(counter));
                    }
                }
                case TRIANGLE -> {
                    for(int counter = 1; counter <= 14; counter++) {
                        if(counter == 6 || counter == 9) continue;
                        push(WhotCard.createTriangleCardsWithValues(counter));
                    }
                }
                case CROSS -> {
                    for(int counter = 1; counter <= 14; counter++) {
                        if(counter == 4 || counter == 6 || counter == 8 || counter == 9 || counter == 12) continue;
                        push(WhotCard.createCrossCardsWithValues(counter));
                    }
                }
                case SQUARE -> {
                    for(int counter = 1; counter <= 14; counter++) {
                        if(counter == 4 || counter == 6 || counter == 8 || counter == 9 || counter == 12) continue;
                        push(WhotCard.createSquareCardsWithValues(counter));
                    }
                }
                case WHOT -> {
                    for(int counter = 1; counter <= 5; counter++) {
                        push(WhotCard.createWhotCardsWithValues(counter));
                    }
                }
            }
        }
        return cardDeck;

    }
}
