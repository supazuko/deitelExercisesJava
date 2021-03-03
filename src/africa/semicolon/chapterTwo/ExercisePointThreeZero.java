import java.util.Scanner;
public class ExercisePointThreeZero{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

	System.out.println("Enter a five digit number e.g 12345");
        	int number = input.nextInt();

	if (number >=10000 && number <=99999){
            int fifthDigit = number%10;
            	number = number/10;
            int fourthDigit = number%10;
            	number = number/10;
            int thirdDigit = number%10;
            	number = number/10;
            int secondDigit = number%10;
            	number = number/10;
            System.out.println(number + "   " + secondDigit + "   " + thirdDigit + "   " + fourthDigit + "   "+ fifthDigit);
        }
        else {
            System.out.println("Invalid Number, Please try again");
        }
}
}