package africa.semicolon.chapterEight;

import java.math.BigDecimal;
import java.util.Scanner;

public class BigDecimalAccountBalanceTest {
    public static void main(String[] args) {

        BigDecimalAccountBalance account1 = new BigDecimalAccountBalance("Jane Green", new BigDecimal(50));
        BigDecimalAccountBalance account2 = new BigDecimalAccountBalance("John Blue", BigDecimal.valueOf(-7.53));

        displayAccount(account1);
        displayAccount(account2);

        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit amount for account1: ");
        BigDecimal depositAmount = input.nextBigDecimal();
        System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
        account1.deposit(depositAmount);

        displayAccount(account1);
        displayAccount(account2);

        System.out.print("Enter deposit amount for account2: ");
        depositAmount = input.nextBigDecimal();
        System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
        account2.deposit(depositAmount);

        displayAccount(account1);
        displayAccount(account2);
    }
    public static void displayAccount(BigDecimalAccountBalance accountToDisplay) {
        System.out.printf("%s balance: $%.2f%n", accountToDisplay.getName(), accountToDisplay.getBalance());
    }
}
