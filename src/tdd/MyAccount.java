package tdd;

public class MyAccount {
    private int pin;
    private double balance;

    public void deposit(double amount) {
        if (amount > 0.0)
        balance += amount;
    }
    public double getBalance() {
        return balance;
    }
    public void withdraw(double amount, int pin) {
        if (amount > 0.0 && amount < balance && pin == 1221) {
            balance -= amount;
        }
        else
            System.out.println("Insufficient balance; " + balance);
    }
    public void setPin(int pin) {
        this.pin = pin;
    }
    public int getPin() {
        return pin;
    }
}
