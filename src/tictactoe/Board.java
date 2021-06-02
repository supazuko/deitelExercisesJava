package tictactoe;

public class Board {
    private Value[][] gameArray = new Value[3][3];

    public Board(){
        for (int row = 0; row < gameArray.length; row++) {
            for (int column = 0; column < gameArray[row].length; column++) {
                gameArray[row][column] = Value.EMPTY;
            }
        }
    }

    public Value[][] getGameArray() {
        return gameArray;
    }

    public void displayBoard(){
        for (int row = 0; row < gameArray.length; row++) {
            for (int column = 0; column < gameArray[row].length; column++) {
                System.out.print(gameArray[row][column] + " ");
            }
            System.out.println();
        }
    }
}
