package africa.semicolon.chapterFour;

import java.util.Scanner;

public class FactorialTest {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int input;
        Factorial factorial = new Factorial();

        System.out.println("Enter a number to calculate its factorial: ");
        input = reader.nextInt();
        factorial.collectInput(input);
        factorial.calculateFactorial(factorial.getInput());
        System.out.printf("The factorial of %d is: %d%n", input, factorial.getFactorial());

//        System.out.println("Enter a number to calculate its mathematical constant e: ");
//        int counter = 1;
//        input = reader.nextInt();
//        factorial.collectInput(input);
//        factorial.calculateFactorial(input);
//        factorial.calculateMathematicalConstantE(factorial.getInput());
//        System.out.printf("The mathematical constant of %d is: %d%n", input, factorial.getMathConstantE());

        System.out.println("Enter a number: ");
        input = reader.nextInt();
        factorial.collectInput(input);
        factorial.calculateMathematicalConstantEToPowerX(factorial.getInput());
        System.out.printf("The mathematical constant of %d to power %d is: %d%n", input, input, factorial.getMathConstantEToPowerX());

    }
}
