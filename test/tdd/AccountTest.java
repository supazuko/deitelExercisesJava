package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    private MyAccount account;
    @BeforeEach
    void startAllTestsWith(){
        account = new MyAccount();
    }
    @Test
    void account_canReceiveDeposit(){
        //when
        account.deposit(2500.00);
        //assert
        assertEquals(2500.00, account.getBalance());
    }
    @Test
    void depositTwice_accountBalanceIsUpdated(){
        //when
        account.deposit(2500.00);
        account.deposit(5000.00);
        //assert
        assertEquals(7500.00, account.getBalance());
    }
    @Test
    void depositThrice_accountBalanceIsUpdated(){
        //when
        account.deposit(2500.00);
        account.deposit(5000.00);
        account.deposit(10000.00);
        //assert
        assertEquals(17500.00, account.getBalance());
    }
    @Test
    public void accountCannotReceiveNegativeDepositTest(){
        account.deposit(-6700.00);
        assertEquals(0.00, account.getBalance());
    }
    @Test
    void userCanWithdrawTest(){
        account.deposit(10000.00);
        account.withdraw(3500.00, 1221);
        assertEquals(6500.00, account.getBalance());
    }
    @Test
    void userCanWithdrawTwiceTest(){
        account.deposit(10000.00);
        account.withdraw(3500.00, 1221);
        account.withdraw(4000.00, 1221);
        assertEquals(2500.00, account.getBalance());
    }
    @Test
    void userCanSetPinTest(){
        account.setPin(1221);
        assertEquals(1221, account.getPin());
    }
}