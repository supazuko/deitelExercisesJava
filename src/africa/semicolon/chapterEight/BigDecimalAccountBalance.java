package africa.semicolon.chapterEight;

import java.math.BigDecimal;

public class BigDecimalAccountBalance {
    private String name;
    private BigDecimal balance;

    public BigDecimalAccountBalance(String name, BigDecimal balance){
        this.name = name;
        if (balance.doubleValue() > 0.0)
            this.balance = balance;
    }
    public void deposit(BigDecimal depositAmount){
        if (depositAmount.doubleValue() > 0.0)
            balance = balance.add(depositAmount);
    }
    public void withdraw(BigDecimal withdrawalAmount) {
        int value = withdrawalAmount.compareTo(balance);
        if (value > 0) {
            System.out.println("Withdrawal amount cannot exceed account balance.");}
        if (value < 0 && withdrawalAmount.doubleValue()> 0.0){
            balance = balance.subtract(withdrawalAmount);
        }
    }
    public BigDecimal getBalance(){
        return balance;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
