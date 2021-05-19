package africa.semicolon.chapterSeven;

import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int userInput;
        int[] earningCounter = new int[9];
        do {
            System.out.println("Enter the amount sold: ");
            double amount = scan.nextDouble();
            double earning = 200 + (0.09 * amount);
            int index = (int) (earning/100);
            if (index > 10){
                index = 10;
            }

            switch (index){
                case 2 -> ++earningCounter[0];
                case 3 -> ++earningCounter[1];
                case 4 -> ++earningCounter[2];
                case 5 -> ++earningCounter[3];
                case 6 -> ++earningCounter[4];
                case 7 -> ++earningCounter[5];
                case 8 -> ++earningCounter[6];
                case 9 -> ++earningCounter[7];
                case 10 -> ++earningCounter[8];
            }
            System.out.println("Your earning is " + earning);
            System.out.println("Press 1 to continue or 0 to exit");
            userInput = scan.nextInt();

        }while(userInput != 0);

        for (int counter : earningCounter) {
            System.out.print(counter);
        }
    }
}
