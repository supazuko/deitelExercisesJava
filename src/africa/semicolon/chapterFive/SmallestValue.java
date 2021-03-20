package africa.semicolon.chapterFive;

import java.util.Scanner;

public class SmallestValue {
    public static void main(String[] args) {
        int i = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to specify number of values you want to compare: ");
        int comparisonValue = input.nextInt();

        System.out.println("Enter an integer: ");
        System.out.println("Number " + i + ": ");
        int smallestValue = input.nextInt();

        for (i = 2; i <= comparisonValue; i++) {
            System.out.println("Enter an integer: ");
            System.out.println("Number " + i + ": ");
            int number = input.nextInt();
            if (number < smallestValue)
                smallestValue = number;
        }
        System.out.println();
        System.out.println("Smallest Value = " + smallestValue);
    }
}
