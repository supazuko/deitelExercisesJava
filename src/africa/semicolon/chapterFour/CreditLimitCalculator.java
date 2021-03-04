package africa.semicolon.chapterFour;

import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        int accountNumber;
        int currentBalance;
        int totalCharges;
        int totalCredits;
        int creditLimit;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Customer's Account Number: ");
        accountNumber = input.nextInt();

        System.out.println("Enter Customer's balance: ");
        currentBalance = input.nextInt();

        System.out.println("Enter Total Charged By Customer this Month: ");
        totalCharges = input.nextInt();

        System.out.println("Enter Total Customer Credits For This Month: ");
        totalCredits = input.nextInt();

        int newBalance = currentBalance + (totalCharges - totalCredits);
        System.out.println("Customer's new account balance is : " + newBalance);

        if (newBalance > totalCredits )
            System.out.println("Customer is within credit limit");
        else if
        (newBalance < totalCredits)
            System.out.println("Credit limit exceeded");
    }
}
