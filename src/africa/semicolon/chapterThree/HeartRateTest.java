package africa.semicolon.chapterFour;

import java.util.Scanner;

public class HeartRateTest {
    public static void main(String[] args) {
        HeartRates patient = new HeartRates("Evans", "Big head", 12, 10, 1940);
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = input.nextLine();
        patient.setFirstName(firstName);

        System.out.print("Enter your last name: ");
        String lastName = input.nextLine();
        patient.setLastName(lastName);

        System.out.print("Enter your day of birth: ");
        int dayOfBirth = input.nextInt();
        patient.setDay(dayOfBirth);
        System.out.print("Enter your month of birth: ");
        int monthOfBirth = input.nextInt();
        patient.setMonth(monthOfBirth);
        System.out.print("Enter your year of birth: ");
        int yearOfBirth = input.nextInt();
        patient.setYear(yearOfBirth);

        patient.setDOB(dayOfBirth, monthOfBirth, yearOfBirth);

        System.out.println("the full name is " + patient.getFirstName() + " " + patient.getLastName());
        System.out.println("the date of birth is " + (patient.getDOB()));
        System.out.println("the age is " + patient.calculateAge());
        System.out.println("the maximum heart rate is " + patient.calculateMaximumHeartRate());
        System.out.println("the target heart rate is " + patient.getTargetHeartRate() + " beats per minute");
    }

}
