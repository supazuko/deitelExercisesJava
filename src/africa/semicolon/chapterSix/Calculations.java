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
}
