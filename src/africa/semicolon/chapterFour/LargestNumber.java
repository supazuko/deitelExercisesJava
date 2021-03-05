package africa.semicolon.chapterFour;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 1;

        System.out.println("Enter integer");
        System.out.println("Number " + counter + ": ");
        int number = input.nextInt();
        int largest = number;

        for (counter = 2; counter <= 10 ; counter++) {
            System.out.println("Enter integer");
            System.out.println("Number " + counter + ": ");
            number = input.nextInt();
            if(number > largest)
                largest = number;
        }
        System.out.println();
        System.out.println("Largest = " + largest);
    }
}