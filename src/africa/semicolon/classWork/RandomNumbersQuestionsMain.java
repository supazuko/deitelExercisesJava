package africa.semicolon.classWork;

import java.util.Scanner;

public class RandomNumbersQuestionsMain {
    public static void main(String[] args) {
        RandomNumbersQuestions random = new RandomNumbersQuestions();
        Scanner input = new Scanner(System.in);
        int questionNumber = 1;
        for (int i = 0; i < 10; i++){
            System.out.println("Question " + questionNumber);

            random.setFirstOperand();
            random.setSecondOperand();
            random.setOperator();
            random.generateQuestion();

            System.out.println(random.question());
            int userInput = input.nextInt();

            random.evaluate(userInput);
            questionNumber++;
            System.out.println();
        }
        System.out.println("Your score is " + random.getScore());
    }
}
