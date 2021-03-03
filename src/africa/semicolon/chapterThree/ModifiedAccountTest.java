import java.util.Scanner;

public class ModifiedAccountTest{
	public static void main(String[] args) {

		ModifiedAccount account1 = new ModifiedAccount("Jane Green", 50.00);
		ModifiedAccount account2 = new ModifiedAccount("John Blue", -7.53);

		displayAccount(account1);
		displayAccount(account2);

		Scanner input = new Scanner(System.in);

		System.out.print("Enter deposit amount for account1: ");
		double depositAmount = input.nextDouble();
		System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
		account1.deposit(depositAmount);

		displayAccount(account1);
		displayAccount(account2);

		System.out.print("Enter deposit amount for account2: ");
		depositAmount = input.nextDouble();
		System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
		account2.deposit(depositAmount);

		displayAccount(account1);
		displayAccount(account2);
	}
	public static void displayAccount(ModifiedAccount accountToDisplay) {
		System.out.printf("%s balance: $%.2f%n", accountToDisplay.getName(), accountToDisplay.getBalance());
	}
	
}