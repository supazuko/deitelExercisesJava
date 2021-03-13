package tdd;

import java.util.Scanner;

public class FactorialMain {
    public static void main(String[] args) {
        int input;
        Factorial factorial = new Factorial();
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number to calculate factorial, exponent and exponent raised to power x: ");
        input = reader.nextInt();

        factorial.calculateFactorial(input);
        System.out.println(factorial.getFactorial());

        factorial.calculateExponent(input);
        System.out.println(factorial.getExponent());

        factorial.calculateExponentRaisedToPowerX(input);
        System.out.println(factorial.getExponentRaisedToPowerX());

    }
}
