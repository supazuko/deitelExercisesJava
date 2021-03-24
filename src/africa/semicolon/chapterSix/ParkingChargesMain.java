package africa.semicolon.chapterSix;

import java.util.Scanner;

public class ParkingChargesMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 10.00; i++) {
            System.out.println("How many hours were you parked for?");
            double totalHours = input.nextDouble();

            double charges = ParkingCharges.calculateCharges(totalHours);
            System.out.println("The cost of parking for " + totalHours + " hours is $" + charges);
            System.out.println();
        }
    }
}
