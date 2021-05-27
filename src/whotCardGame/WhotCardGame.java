package whotCardGame;

public class WhotCardGame {
    private int numberOfCardsToDeal;
    private int numberOfPlayers;


    public WhotCardGame(int numberOfPlayers, int numberOfCardsToDeal) {
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
