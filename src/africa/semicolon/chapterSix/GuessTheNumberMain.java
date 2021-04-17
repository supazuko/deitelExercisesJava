package africa.semicolon.chapterSix;

import java.util.Scanner;

public class GuessTheNumberMain {
    public static void main(String[] args) {
        boolean userWantsToKeepPlaying = true;

        while(userWantsToKeepPlaying) {
            int numberToGuess = GuessTheNumber.generateNumberToGuess();
            System.out.println("Guess a number between 1 and 1000: ");
            Scanner scanner = new Scanner(System.in);
            int userGuess;

            do {
                userGuess = scanner.nextInt();
                System.out.println(GuessTheNumber.validateGuessedNumber(userGuess));
            } while (userGuess != numberToGuess);

            System.out.println();
            System.out.println("""
                    Do you want to play again?
                    Press any number to replay.
                    Press 0 quit game.
                    """);
            int userChoice = scanner.nextInt();
            if(userChoice == 0)
                userWantsToKeepPlaying = false;
        }
    }
}
