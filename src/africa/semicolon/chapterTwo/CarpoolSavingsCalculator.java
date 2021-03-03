import java.util.Scanner;

public class CarpoolSavingsCalculator{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter total miles per day: ");
        	double totalMilesPerDay = input.nextInt();
        System.out.print("Enter cost per litre of fuel: ");
        	double costPerLitreOfFuel = input.nextInt();
        System.out.print("Enter average miles per litre: ");
        	double averageMilesPerLitre = input.nextInt();
        System.out.print("Enter parking fees per day: ");
        	double parkingFeesPerDay = input.nextInt();
        System.out.print("Enter tolls per day: ");
        	double tollsPerDay = input.nextInt();

	double miles = totalMilesPerDay/averageMilesPerLitre;

        double dailyDrivingCost = miles * costPerLitreOfFuel + (parkingFeesPerDay + tollsPerDay);

        System.out.println("The daily cost of driving is " + dailyDrivingCost);
    }
}