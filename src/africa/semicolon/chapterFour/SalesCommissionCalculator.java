package africa.semicolon.chapterFour;

import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalSales = 0;
        double salesCommission;
        double salesEarning;
        double item1 = 239.99;
        double item2 = 129.75;
        double item3 = 99.95;
        double item4 = 350.89;

        System.out.println("Select items sold \n");
        String prompt = """
                -> Enter 0 to Calculate Sales Earnings.
                -> Enter 1 for item 1: 239.99.
                -> Enter 2 for item 2: 129.75.
                -> Enter 3 for item 3: 99.95.
                -> Enter 4 for item 4: 350.89.
                """;

        System.out.println(prompt);
        int userSelection = input.nextInt();
        while (userSelection != 0) {
            switch (userSelection) {
                case 1 -> {
                    System.out.print("You have selected item 1: ");
                    System.out.println(item1);
                    totalSales += item1;
                }
                case 2 -> {
                    System.out.print("You have selected item 2: ");
                    System.out.println(item2);
                    totalSales += item2;
                }
                case 3 -> {
                    System.out.print("You have selected item 3: ");
                    System.out.println(item3);
                    totalSales += item3;
                }
                case 4 -> {
                    System.out.print("You have selected item 4: ");
                    System.out.println(item4);
                    totalSales += item4;
                }
                default -> System.out.println("Invalid Selection");
            }
            System.out.println(totalSales);
            System.out.println();

            System.out.println(prompt);
            userSelection = input.nextInt();
        }
        salesCommission = 0.09 * totalSales;
        salesEarning = 200 + salesCommission;
        System.out.printf("Sales earning for last week is $%.2f%n", salesEarning);
    }
}