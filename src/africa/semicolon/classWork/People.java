import java.util.Scanner;
public class People {
	public static void main(String[] args){
	Scanner elsa = new Scanner(System.in);
	
	int firstNumber = elsa.nextInt();
	int secondNumber = elsa.nextInt();
	int result = firstNumber + secondNumber;
	System.out.println("The number is: ");
	System.out.printf("The sum is %d", result);
}



}