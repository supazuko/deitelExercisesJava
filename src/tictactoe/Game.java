package tictactoe;

import java.security.SecureRandom;
import java.util.HashSet;
import java.util.Set;

public class Game {
    private Board gameBoard;
    private boolean gameWon;
    private boolean BoardFull;
    boolean lastValuePlayedWasX;
    boolean computerHasPlayed;
    private int movesMade = 0;

    public Game() {
        this.gameBoard = new Board();
        this.gameWon = false;
        this.BoardFull = false;
        this.lastValuePlayedWasX = false;
    }

    public void move(int gridPosition) throws GameOverException, BoardFullException, AlreadyOccupiedException, ArrayIndexOutOfBoundsException {
        if (BoardFull) {
            throw new BoardFullException();
        }
        if (gridPosition < 1 || gridPosition > 9) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int position = gridPosition - 1;
        int row = position / 3;
        int column = position % 3;
        Value[][] array = gameBoard.getGameArray();
        if (array[row][column] != Value.EMPTY) {
            throw new AlreadyOccupiedException();
        }
        if (lastValuePlayedWasX) {
            array[row][column] = Value.O;
            lastValuePlayedWasX = false;
        } else {
            array[row][column] = Value.X;
            lastValuePlayedWasX = true;
        }
        if (isGameWon()) {
            throw new GameOverException();
        }
        if (movesMade < 9) {
            movesMade++;
        }
        if (movesMade == 9) {
            BoardFull = true;
        }
    }

    public void computerPlay() throws GameOverException, BoardFullException, AlreadyOccupiedException {
        SecureRandom random = new SecureRandom();
        if (BoardFull) {
            throw new BoardFullException();
        }
        int row;
        int column;
        Value[][] array = gameBoard.getGameArray();
        do {
            int position = 1 + random.nextInt(9);
            row = (position - 1) / 3;
            column = (position - 1) % 3;
        } while (array[row][column] != Value.EMPTY);

        array[row][column] = Value.X;
        computerHasPlayed = true;
        lastValuePlayedWasX = true;
        if (isGameWon()) {
            throw new GameOverException();
        }
        if (movesMade < 9) {
            movesMade++;
        }
        if (movesMade == 9) {
            BoardFull = true;
        }
    }

    public boolean isGameWon() {
        Value[][] array = gameBoard.getGameArray();
        for (int row = 0; row < array.length; row++) {
            Set<Value> values = new HashSet<>();
            for (int column = 0; column < array[row].length; column++) {
                values.add(array[row][column]);
            }
            if (!values.contains(Value.EMPTY) && values.size() == 1) {
                return true;
            }
        }
        for (int column = 0; column < array.length; column++) {
            Set<Value> values = new HashSet<>();
            for (int row = 0; row < array.length; row++) {
                values.add(array[row][column]);
            }
            if (!values.contains(Value.EMPTY) && values.size() == 1) {
                return true;
            }
        }
        Set<Value> leftDiagonalValues = new HashSet<>();
        for (int i = 0; i < array.length; i++) {

            leftDiagonalValues.add(array[i][i]);
        }
        if (!leftDiagonalValues.contains(Value.EMPTY) && leftDiagonalValues.size() == 1) {
            return true;
        }
        Set<Value> rightDiagonalValues = new HashSet<>();

        for (int row = 2, column = 0; row >= 0 && column < array.length; row--, column++) {
            rightDiagonalValues.add(array[row][column]);
        }

        if (!rightDiagonalValues.contains(Value.EMPTY) && rightDiagonalValues.size() == 1) {
            return true;
        }
        return false;
    }

    public void displayBoard() {
        gameBoard.displayBoard();
    }
}
