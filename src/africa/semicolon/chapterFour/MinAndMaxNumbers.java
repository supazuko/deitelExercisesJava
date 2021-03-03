package africa.semicolon.chapterFour;

import java.util.Scanner;

public class MinAndMaxNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 1;

        System.out.print("Enter integer:");
        int numbers = input.nextInt();
        System.out.println("Number " + i + "; ");
        int smallest = numbers;
        int largest = numbers;

        for (i = 2; i <= 10 ; i++) {
            System.out.print("Enter integer:");
            numbers = input.nextInt();
            System.out.println("Number " + i + "; ");
            if(numbers > largest){
                largest = numbers;
            }
            if (numbers < smallest) {
                smallest = numbers;
            }
        }
        System.out.println("Smallest = " + smallest);
        System.out.println("Largest = " + largest);
    }
}