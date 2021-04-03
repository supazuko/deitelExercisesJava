package africa.semicolon.classWork;

import java.util.Scanner;

public class ATMachineMain {
    public static void main(String[] args) {
        ATMachine myAccount = new ATMachine();
        Scanner input = new Scanner(System.in);

        String startMessage = "";
        System.out.println("Please enter a 4-digit number to create your pin");
        int pin = input.nextInt();

        System.out.println("Enter new PIN: ");
        int userPin = input.nextInt();

        if(userPin != pin) {
            System.out.println("invalid PIN, try again");
        }

        else{
            String promptMessage = """
                -> Press 1 for Deposit.
                -> Press 2 for Withdraw.
                -> Press 3 for Check Balance.
                -> Press 4 for Transfer.
                -> Press 0 for Transaction Completed.
                """;
            System.out.println(promptMessage);

            double deposit;
            double withdraw;
            double transfer;

            while(true) {
                int userInput = input.nextInt();
                switch (userInput) {
                    case 1 -> {
                        System.out.println("How much do you want to deposit? ");
                        deposit = input.nextInt();
                        double currentBalance = myAccount.getBalance();
                        myAccount.deposit(deposit, pin);
                        double newBalance = myAccount.getBalance();
                        if (newBalance != currentBalance) {
                            System.out.println("you have deposited " + deposit);
                            System.out.println("Account balance is " + myAccount.getBalance());
                        } else {
                            System.out.println("Deposit unsuccessful");
                        }
                    }
                    case 2 -> {
                        System.out.println("How much do you want to withdraw? ");
                        withdraw = input.nextInt();
                        myAccount.withdraw(withdraw, pin);
                        System.out.println("you want to withdraw " + withdraw);
                        System.out.println("Account balance is " + myAccount.getBalance());
                    }
                    case 3 -> {
                        System.out.println("Check Account Balance");
                        System.out.println("Account balance is " + myAccount.getBalance());
                    }
                    case 4 -> {
                        System.out.println("Enter Transfer Amount");
                        transfer = input.nextInt();
                        myAccount.transfer(transfer, pin);
                        System.out.println("you have transferred " + transfer);
                        System.out.println("Account balance is " + myAccount.getBalance());
                    }
                    case 0 -> {
                        System.out.println("Take your card \n\n Thank you");
                        return;
                    }
                    default -> System.out.println("Wrong Input");
                }
                System.out.println();
                System.out.println(promptMessage);
                // userInput++;
            }
        }
    }
}
