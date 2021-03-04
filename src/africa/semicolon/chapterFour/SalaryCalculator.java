package africa.semicolon.chapterFour;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        int employeeNumber = 1;
        double grossPay = 0.00;
        double hourlyRate = 0.00;
        int hoursWorked = 1 ;

        Scanner input = new Scanner(System.in);
        System.out.print("Input the number of hours worked by employee " + employeeNumber + ": ");
        hoursWorked = input.nextInt();

        if(hoursWorked > 1) {
            System.out.print("Input the hourly rate payable to employee " + employeeNumber + ": ");
            hourlyRate = input.nextDouble();
        }

        if (hoursWorked <= 40)
            grossPay = hoursWorked * hourlyRate;
        else if (hoursWorked > 40)
            grossPay = (hoursWorked * hourlyRate) + ((hourlyRate/2) * (hoursWorked - 40));

        System.out.printf("The gross pay for employee %d%s%.2f%n%n", employeeNumber, " is ", grossPay);

        while (hoursWorked != 1 && employeeNumber <3 ){
            employeeNumber++;
            System.out.print("Input the number of hours worked by employee " + employeeNumber + " or -1 to quit: ");
            hoursWorked = input.nextInt();

            if(hoursWorked != -1) {
                System.out.print("Input the hourly rate payable to employee " + employeeNumber + ": ");
                hourlyRate = input.nextDouble();
            }
            if (hoursWorked <= 40)
                grossPay = hoursWorked * hourlyRate;
            else if (hoursWorked != 40)
                grossPay = (hoursWorked * hourlyRate) + ((hourlyRate/2) * (hoursWorked - 40));

            System.out.printf("The gross pay for employee %d%s%.2f%n%n", employeeNumber, " is ", grossPay);

        }

    }



}
