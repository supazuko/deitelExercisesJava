package cardGame;

public class Croupier {

    public void shuffle(CardDeck deck) {
        deck.shuffle();
    }
    public Card serveCard(CardDeck deck) {
        return deck.pop();
    }
}
