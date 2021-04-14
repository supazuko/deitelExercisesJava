package africa.semicolon.chapterFive;

import java.util.Scanner;

public class CalculatingSales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String prompt = """
                Enter a number to select a product:
                Product 1 - $2.98
                Product 2 - $4.50
                Product 3 - $9.98
                Product 4 - $4.49
                Product 5 - $6.87
                Enter 0 to add up total price
                """;

        double price;
        double totalQuantitySold = 0;

        System.out.println(prompt);
        int productID = input.nextInt();

        while(productID != 0){
            System.out.println("Enter quantity of product " + productID + " you want to buy");
            int quantitySold = input.nextInt();

            switch (productID) {
                case 1 -> {
                    price = 2.98;
                    totalQuantitySold += price * quantitySold;
                    System.out.println("$" + totalQuantitySold);
                }
                case 2 -> {
                    price = 4.50;
                    totalQuantitySold += price * quantitySold;
                    System.out.println("$" + totalQuantitySold);
                }
                case 3 -> {
                    price = 9.98;
                    totalQuantitySold += price * quantitySold;
                    System.out.println("$" + totalQuantitySold);
                }
                case 4 -> {
                    price = 4.49;
                    totalQuantitySold += price * quantitySold;
                    System.out.println("$" + totalQuantitySold);
                }
                case 5 -> {
                    price = 6.87;
                    totalQuantitySold += price * quantitySold;
                    System.out.println("$" + totalQuantitySold);
                }
                default -> System.out.println("Enter a valid input");
            }
            System.out.println();
            System.out.println(prompt);
            productID = input.nextInt();
        }
        System.out.println("Your retail total is $" + totalQuantitySold);
    }
}
