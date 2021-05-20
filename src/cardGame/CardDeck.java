package cardGame;

import cardGame.exceptions.StackOverflowException;
import cardGame.exceptions.StackUnderflowException;

public class CardDeck {
    private int lastPushLocation = -1;
    private Card[] cards;

    public CardDeck(int numberOfCards) {
        cards = new Card[numberOfCards];
    }

    public int getSize() {
        return cards.length;
    }

    public void push(Card card) {
        if (isFull()) throw new StackOverflowException("Card deck is full");
        lastPushLocation++;
        cards[lastPushLocation] = card;
    }

    public Card peek() {
        if (isEmpty()) throw new StackUnderflowException("Card deck is empty");
        return cards[lastPushLocation];
    }

    public Card pop() {
        if (isEmpty()) throw new StackUnderflowException("Card deck is empty");
//        cards[lastPushLocation--] = null;
//        return cards[lastPushLocation];
        return cards[lastPushLocation--];
    }

    public boolean isEmpty() {
        return lastPushLocation == -1;
    }

    public boolean isFull() {
        return lastPushLocation == getSize()-1;
    }
}
