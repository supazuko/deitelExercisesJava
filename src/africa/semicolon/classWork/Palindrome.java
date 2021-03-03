/*Collect input from user
Check if number is a palindrome by reversing and comparing each digit
	if number == palindrome
		print "yes"
	else
		print "no"*/

import java.util.Scanner;
public class Palindrome{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
	int firstDigit;
	int secondDigit;
	int thirdDigit;

	System.out.print("Enter first digit: ");
		firstDigit = input.nextInt();
	System.out.print("Enter second digit: ");
		secondDigit = input.nextInt();
	System.out.print("Enter third digit: ");
		thirdDigit = input.nextInt();

	if (firstDigit == thirdDigit )
		//if (secondDigit == secondDigit)
		if (thirdDigit == firstDigit){
		System.out.println("it's a palindrome");
		}
	if
		(firstDigit != thirdDigit )
		//if (secondDigit != secondDigit)
		//if (thirdDigit != firstDigit)
		{
		System.out.println("not a palindrome");
		}
}
}