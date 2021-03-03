import java.util.Scanner;
public class Average{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		int number1;
		int number2;
		int number3;
		int sum;
		int product;
		int average;
		int smallestValue;
        	int largestValue;
        	int x;

		System.out.print("Enter first integer:");
			number1 = input.nextInt();
		System.out.print("Enter second integer:");
			number2 = input.nextInt();
		System.out.print("Enter third integer:");
			number3 = input.nextInt();

		largestValue = number1;
        	smallestValue = number1;
        	x = number1;
		if(x > number2) {
            	smallestValue = number2;
        	}
        	if(x < number2) {
            	largestValue = number2;
        	}
		if (x > number3){
            	smallestValue = number3;
        	}
        	if(x < number3){
            	largestValue = number3;
        	}
		sum = number1 + number2 + number3;
		product = number1 * number2 * number3;
		average = sum / 3;


	System.out.printf("%d%n%d%n%d%n%d%n%d%n", sum, product, average, smallestValue, largestValue);
}
}