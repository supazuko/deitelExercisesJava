package tdd;

import java.util.Scanner;

public class Kata {
    public String name = "Tunji";

    public double calculateAverage(int firstNumber, int secondNumber, int thirdNumber) {
        double average;
        average = (firstNumber + secondNumber + thirdNumber) / 3.0;
        return average;
    }

    public String calculateGrade(int score) {
        if (score >= 0 && score <= 100) {
            if (score >= 90)
                return "A";
            else if (score >= 80 && score <= 89.9)
                return "B";
            else if (score >= 70 && score <= 79.9)
                return "C";
            else if (score < 70)
                return "F";
        } else
            return "Invalid Score";
        return null;
    }

    public boolean isEven(int number){
        boolean isEven = (number % 2 == 0);
            return isEven;
    }
    public boolean isPrimeNumber(int number){
        if (number <= 1){
            return false;}
//        for (int i = 1; i < number; i++)
//            if (number % i == 0);
//              return true;
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int calculatePriceFor(int testDrillerQuantity) {
        int unitPrice = 0;
        if (testDrillerQuantity >= 1 && testDrillerQuantity <= 4){
            unitPrice = 1500;
        }
        if (testDrillerQuantity >= 5 && testDrillerQuantity <= 10){
            unitPrice = 1400;
        }
        if (testDrillerQuantity >=11 && testDrillerQuantity <= 29){
            unitPrice = 1200;
        }
        if (testDrillerQuantity >=30 && testDrillerQuantity <= 49){
            unitPrice = 1100;
        }
        if (testDrillerQuantity >=50 && testDrillerQuantity <= 99){
            unitPrice = 1000;
        }
        if (testDrillerQuantity >=100 && testDrillerQuantity <= 199){
            unitPrice = 900;
        }
        if (testDrillerQuantity >=200){
            unitPrice = 800;
        }
        return unitPrice * testDrillerQuantity;
    }
}
