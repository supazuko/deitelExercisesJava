package africa.semicolon.classWork;

import tdd.MyAccount;

public class ATMachine {
    private int pin;
    private double balance;

    public ATMachine(int pin, double balance) {
        this.pin = pin;
        this.balance = balance;
    }

    public ATMachine() {

    }

    public void setPin(int pin) {
        if (pin >= 1000 && pin <= 9999) {
            pin = this.pin;
        }else
            System.out.println("invalid pin");
    }

    public int getPin() {
        return pin;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount, int pin) {
        balance = balance + amount;
    }

    public void withdraw(double amount, int pin) {
        if (pin == this.pin && amount > 0.0 && amount < balance){
            balance = balance - amount;}

        else if (balance < amount){
            System.out.println("insufficient balance");
        }
        else
            balance = balance - amount;
    }

    public void transfer(double amount, int pin) {
        if (pin == this.pin && amount > 0.0 && this.balance > amount) {
            balance = balance - amount;
        }
    }
//    public void transfer(MyAccount myAccount, MyAccount beneficiaryAccount, int userPin, double transferAmount) {
//        ATMachine.transfer(transferAmount, userPin);
//        beneficiaryAccount.deposit(transferAmount);
//        System.out.println("Transaction successful");
//    }
}
