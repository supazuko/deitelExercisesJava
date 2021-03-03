import java.util.Scanner;

public class ZerosInputValue{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber;
        int secondNumber;
        int thirdNumber;
        int fourthNumber;
        int fifthNumber;
        int positiveInput = 0;
        int negativeInput = 0;
        int zeroInput = 0;

        System.out.print("Enter first value: ");
        	firstNumber = input.nextInt();
        System.out.print("Enter second value: ");
        	secondNumber = input.nextInt();
        System.out.print("Enter third value: ");
        	thirdNumber = input.nextInt();
        System.out.print("Enter fourth value: ");
        	fourthNumber = input.nextInt();
        System.out.print("Enter fifth value: ");
        	fifthNumber = input.nextInt();

        if (firstNumber > 0){
            positiveInput = positiveInput+1;
        	}
        if (firstNumber == 0){
            zeroInput = zeroInput+1;
        	}
        if (firstNumber < 0){
            negativeInput = negativeInput+1;
        	}
        if (secondNumber > 0){
            positiveInput = positiveInput+1;
        	}
        if (secondNumber == 0){
            zeroInput = zeroInput+1;
        	}
        if (secondNumber < 0){
            negativeInput = negativeInput+1;
        	}
        if (thirdNumber > 0){
            positiveInput = positiveInput+1;
        	}
        if (thirdNumber == 0){
            zeroInput = zeroInput+1;
        	}
        if (thirdNumber < 0){
            negativeInput = negativeInput+1;
        	}
        if (fourthNumber > 0){
            positiveInput = positiveInput+1;
        	}
        if (fourthNumber == 0){
            zeroInput = zeroInput+1;
        	}
        if (fourthNumber < 0){
            negativeInput = negativeInput+1;
        	}
        if (fifthNumber > 0){
            positiveInput = positiveInput+1;
        	}
        if (fifthNumber == 0){
            zeroInput = zeroInput+1;
        	}
        if (fifthNumber < 0){
            negativeInput = negativeInput+1;
        	}

        System.out.printf("Number of positive values is/are :%d%n", positiveInput);
	System.out.printf("Number of negative values is/are :%d%n", negativeInput);
	System.out.printf("Number of zeros is/are :%d%n", zeroInput);

    }
}