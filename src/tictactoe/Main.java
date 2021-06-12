package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws AlreadyOccupiedException, BoardFullException, GameOverException {
        Game game = new Game();
        Scanner scanner = new Scanner(System.in);
        boolean gameOver = false;
        int position;

        while (!gameOver){
            try {
                System.out.println("Computer play: ");
                game.computerPlay();
                game.displayBoard();
                System.out.println("Enter a number between 1-9 to play: ");
                position = scanner.nextInt();
                game.move(position);
                game.displayBoard();
            }catch (ArrayIndexOutOfBoundsException e){
                do {
                    System.out.println("Invalid entry, try again: ");
                    game.displayBoard();
                    position = scanner.nextInt();

                } while (position < 1 || position > 9);
                game.move(position);
            }catch (GameOverException e){
                if (game.lastValuePlayedWasX) {
                    game.displayBoard();
                    System.out.println();
                    System.out.println("X won!");
                }else {
                    game.displayBoard();
                    System.out.println();
                    System.out.println("O won!");
                }
                gameOver = true;
            }catch (BoardFullException e){
                gameOver = true;
                game.displayBoard();
                System.out.println();
                System.out.println("It's a draw!");
            }catch (AlreadyOccupiedException e){
                System.out.println("That position is already occupied");
                game.displayBoard();
                System.out.println("Enter a position to play: ");
                position = scanner.nextInt();
                game.move(position);
            }
        }
    }
}
