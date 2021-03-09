package africa.semicolon.chapterFour;

import java.util.Scanner;

public class ValidatingUserInput {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            int result;
            int pass = 0;
            int failure = 0;
            int counter;

            for (counter = 1; counter <= 10; counter++) {
                System.out.println("Enter result (1 = pass, 2 = fail): ");
                result = input.nextInt();

                if(result == 1) {
                    pass += 1;
                }
                else if(result == 2) {
                    failure += 1;
                }
                else
                    System.out.println("Wrong input");
            }
            System.out.println("Passed: "+ pass);
            System.out.println("Failed: "+ failure);

            if(pass > 8)
                System.out.println("Bonus to instructor!");
        }
}
