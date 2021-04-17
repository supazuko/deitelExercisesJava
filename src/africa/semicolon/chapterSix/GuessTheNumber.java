package africa.semicolon.chapterSix;

import java.security.SecureRandom;

public class GuessTheNumber {
    private static int numberToGuess;
    private static int guessCount;

    public static int generateNumberToGuess() {
        SecureRandom random = new SecureRandom();
        numberToGuess = 1 + random.nextInt(1000);
        return numberToGuess;
    }

    public static String validateGuessedNumber(int number) {
        if(number > numberToGuess){
            guessCount++;
            return "Too high, try again.";
        }
        else if(number < numberToGuess){
            guessCount++;
            return "Too low, try again.";
        }
        else
            return "Congratulations. You guessed the number!";
    }
}
