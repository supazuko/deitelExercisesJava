package tdd;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner input = new Scanner(System.in);
        String prompt = """
                Hello user,
                -> Enter 1 for addition.
                -> Enter 2 for absolute subtraction.
                -> Enter 3 for multiplication.
                -> Enter 4 for division.
                """;

        System.out.println(prompt);
        int userSelection = input.nextInt();
        System.out.println("Enter first number");
        int firstNumber = input.nextInt();
        System.out.println("Enter second number");
        int secondNumber = input.nextInt();

        switch (userSelection){
            case 1:
                System.out.println(calculator.add(firstNumber,secondNumber));
                break;
            case 2:
                System.out.println(calculator.subtract(firstNumber, secondNumber));
                break;
            case 3:
                System.out.println(calculator.multiply(firstNumber, secondNumber));
                break;
            case 4:
                System.out.println(calculator.divide(firstNumber, secondNumber));
            default:
                System.out.println("Oga choose something reasonable");
        }
    }
}
