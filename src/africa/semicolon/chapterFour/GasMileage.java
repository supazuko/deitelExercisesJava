package africa.semicolon.chapterFour;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        int milesDriven;
        int gallonsUsed = 0;
        double totalMilesPerGallon = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of miles driven in this trip or -1 to quit");
        milesDriven = input.nextInt();


        if (milesDriven != 0) {
                System.out.println("Input the amount of gallons used for the trip");
                gallonsUsed = input.nextInt();
        }

        while(milesDriven != -1) {
            double milesPerGallon = ((double) milesDriven) / gallonsUsed;
            totalMilesPerGallon += milesPerGallon;

            System.out.printf("in this trip, you travelled at rate of %.2f%s%n", milesPerGallon, " miles per gallon");
            System.out.printf("Total miles per gallon so far = %.2f%n%n", totalMilesPerGallon);

            System.out.println("Enter the number of miles driven in this trip or -1 to quit");
            milesDriven = input.nextInt();
            if (milesDriven != -1) {
                System.out.println("Enter the gallons used for the trip");
                gallonsUsed = input.nextInt();
            }
        }
    }
}
