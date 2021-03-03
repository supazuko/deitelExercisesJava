import java.util.Scanner;
public class ExerciseTwoPointTwoFour{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int number1;
	int number2;
	int number3;
	int number4;
	int number5;
	int smallestValue;
        int largestValue;
        int x;
	
	System.out.print("Enter first integer:");
		number1 = input.nextInt();
	System.out.print("Enter second integer:");
		number2 = input.nextInt();
	System.out.print("Enter third integer:");
		number3 = input.nextInt();
	System.out.print("Enter fourth integer:");
		number4 = input.nextInt();
	System.out.print("Enter fifth integer:");
		number5 = input.nextInt();

	largestValue = number1;
        smallestValue = number1;
        x = number1;
	if(x > number2){
            smallestValue = number2;
        }
        if(x < number2){
            largestValue = number2;
        }
	if (x > number3){
            smallestValue = number3;
        }
        if(x < number3){
            largestValue = number3;
        }
	if (x > number4){
            smallestValue = number4;
        }
        if(x < number4){
            largestValue = number4;
        }
	if (x > number5){
            smallestValue = number5;
        }
        if(x < number5){
            largestValue = number5;
        }
	System.out.printf("%d%n%d%n", smallestValue, largestValue);

}
}