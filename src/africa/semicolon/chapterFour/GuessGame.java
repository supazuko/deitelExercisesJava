package africa.semicolon.chapterFour;

import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Scanner guess = new Scanner(System.in);

        String answer = "utopia";
        String guessInput;
          do {
          System.out.println("Guess the capital of Utopia: ");
           guessInput = guess.nextLine();
//           System.out.println("Wrong answer!");

          }while (!answer.equals(guessInput));
          System.out.println("Correct Answer!");
     }
//    switch (guessInput){
//        case "utopia":
//            System.out.println("correct answer!");
//            break;
//        default:
//            System.out.println("Wrong answer!");
//            System.out.println("Guess the capital of Utopia");
//    }        guessInput = guess.nextLine();
//             System.out.println(guessInput);
//    }
}
