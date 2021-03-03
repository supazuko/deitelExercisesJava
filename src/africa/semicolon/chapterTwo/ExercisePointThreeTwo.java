import java.util.Scanner;
public class ExercisePointThreeTwo{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

	int firstNumber;
        int secondNumber;
        int thirdNumber;
        int fourthNumber;
        int fifthNumber;
        int positiveValue = 0;
        int negativeValue = 0;
        int zero = 0;

        System.out.print("Enter first number: ");
        	firstNumber = input.nextInt();
        System.out.print("Enter next number: ");
        	secondNumber = input.nextInt();
        System.out.print("Enter next number: ");
        	thirdNumber = input.nextInt();
        System.out.print("Enter next number: ");
        	fourthNumber = input.nextInt();
        System.out.print("Enter next number: ");
        	fifthNumber = input.nextInt();

	 if (firstNumber > 0){
            positiveValue = positiveValue + 1;
        }
        if (firstNumber == 0){
            zero = zero + 1;
        }
        if (firstNumber < 0){
            negativeValue = negativeValue + 1;
        }
        if (secondNumber > 0){
            positiveValue = positiveValue + 1;
        }
        if (secondNumber == 0){
            zero = zero + 1;
        }
        if (secondNumber < 0){
            negativeValue = negativeValue + 1;
        }
        if (thirdNumber > 0){
            positiveValue = positiveValue + 1;
        }
        if (thirdNumber == 0){
            zero = zero + 1;
        }
        if (thirdNumber < 0){
            negativeValue = negativeValue + 1;
        }
        if (fourthNumber > 0){
            positiveValue = positiveValue + 1;
        }
        if (fourthNumber == 0){
            zero = zero + 1;
        }
        if (fourthNumber < 0){
            negativeValue = negativeValue + 1;
        }
        if (fifthNumber > 0){
            positiveValue = positiveValue + 1;
        }
        if (fifthNumber == 0){
            zero = zero + 1;
        }
        if (fifthNumber < 0){
            negativeValue = negativeValue + 1;
        }
        System.out.printf("Positive number(s) is %d%nNegative number(s) is %d%nzero is %d%n", positiveValue, negativeValue, zero);
    }
}