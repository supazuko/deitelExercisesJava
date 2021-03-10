package africa.semicolon.classWork;

import java.util.Scanner;

public class FactorsOfANumber {
    public static void main(String[] args) {
        int number;
        int i;
        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        for (i = 1; i < number; i++) {
            if (number % i == 0) {
                System.out.println("factors are " + i);
            }
        }
    }
}
