package cardGame;

public class CardGame {
    private int numberOfCardsToDeal;
    private int numberOfPlayers;


    public CardGame(int numberOfPlayers, int numberOfCardsToDeal) {
        this.numberOfPlayers = numberOfPlayers;
        this.numberOfCardsToDeal = numberOfCardsToDeal;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public int getNumberOfCardsToDeal() {
        return numberOfCardsToDeal;
    }
}
