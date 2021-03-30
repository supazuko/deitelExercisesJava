package africa.semicolon.chapterSix;

import java.util.Scanner;

public class Calculations {
    public static boolean isMultiple(int firstNumber, int secondNumber){
        if (firstNumber % secondNumber == 0){
            return true;
        }else return false;
    }

    public static boolean isEven(int number){
        if (number % 2 == 0){
            return true;
        }else return false;
    }

    public static String squareOfAsterisks(int side) {
        String asterisks = "";
        int counter = 0;
        while(counter < side){
            for (int i = 0; i < side; i++) {
                asterisks += "*";
            }
            counter++;
            if(counter == side)
                break;
            asterisks += "\n";
        }
        return asterisks;
    }

    public static double circleArea(double radius) {
        return (Math.PI * radius * radius);
    }

    public static double minimum3(double firstNumber, double secondNumber, double thirdNumber){
        double smallestValue = Math.min(firstNumber, Math.min(secondNumber, thirdNumber));
        return smallestValue;
    }

    public static double hypotenuse(double side1, double side2){
        double side3 = (Math.pow(side1, 2) + Math.pow(side2, 2));
        double hypotenuse = Math.sqrt(side3);
        return hypotenuse;
    }

    public static String squareOfAnyCharacter(int side, char fillCharacter) {
        StringBuilder characters = new StringBuilder();
        int counter = 0;
        while(counter < side){
            for (int i = 0; i < side; i++) {
                characters.append(fillCharacter);
            }
            counter++;
            if(counter == side)
                break;
            characters.append("\n");
        }
        return characters.toString();
    }

    public static int integerPower(int base, int exponent){
        int counter = 0;
        int powerOfInteger = 1;
        if (exponent > 0) {
            while (counter < exponent) {
                powerOfInteger *= base;
                counter++;
            }
        }return powerOfInteger;
    }

    public static boolean isPerfect(int number) {
        int total = 0;
        for (int i = 1; i <= (number/2); i++) {
            if(number % i == 0)
                total += i;
        }
        return total == number;
    }

    public static boolean isPrime(int number) {
        int counter = 0;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if(number % i == 0)
                counter++;
        }
        return counter == 0;
    }

    public static int decimalToHexadecimal(int decimalNumber) {
        int hexadecimal = 0;
        int multiplier = 1;
        while(decimalNumber > 0){
            hexadecimal += multiplier * (decimalNumber % 16);
            decimalNumber = decimalNumber/16;
            multiplier = multiplier*10;
        }
        return hexadecimal;
    }
}
