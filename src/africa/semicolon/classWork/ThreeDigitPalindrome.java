import java.util.Scanner;
public class ThreeDigitPalindrome{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a number: ");
		int number = input.nextInt();
	
	int firstDigit = number/100;
	int lastDigit = number%10;
	boolean isPalindrome = firstDigit == lastDigit;

	if (isPalindrome) {
		System.out.println("Your number is a palindrome");
		}
	else {
		System.out.println("Your number is not a palindrome");
		}
}
}	