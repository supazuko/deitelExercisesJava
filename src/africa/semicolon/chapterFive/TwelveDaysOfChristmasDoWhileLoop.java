package africa.semicolon.chapterFour;

import java.util.Scanner;

public class TwelveDaysOfChristmasDoWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int day = 1;
        do {
            System.out.println();
            System.out.println("12 Days Of Christmas Song.");
            System.out.println("Select a day from the Christmas song...");

            day = input.nextInt();

            switch (day) {
                case 1:
                    System.out.print("On the " + day + "st");
                    break;
                case 2:
                    System.out.print("On the " + day + "nd");
                    break;
                case 3:
                    System.out.print("On the " + day + "rd");
                    break;
                default:
                    if (day >= 4 && day <= 12)
                        System.out.print("On the " + day + "th");
                    else
                        return;
            }

            System.out.println(" day of Christmas my true love sent to me,");

            switch (day) {

                case 12:
                    System.out.println("Twelve drummers drumming, ");
                case 11:
                    System.out.println("Eleven pipers piping, ");
                case 10:
                    System.out.println("Ten lords a leaping, ");
                case 9:
                    System.out.println("Nine ladies dancing, ");
                case 8:
                    System.out.println("Eight maids a milking, ");
                case 7:
                    System.out.println("Seven swans a swimming, ");
                case 6:
                    System.out.println("Six geese a laying, ");
                case 5:
                    System.out.println("Five golden rings, ");
                case 4:
                    System.out.println("Four calling birds, ");
                case 3:
                    System.out.println("Three French hens, ");
                case 2:
                    System.out.println("Two turtle doves, ");
                default:
                    if (day == 1) System.out.println("A partridge in a pear tree.");
                    else
                        System.out.println("And a partridge in a pear tree.");
            }
            day++;
        }
        while (day <= 12);
    }
}
