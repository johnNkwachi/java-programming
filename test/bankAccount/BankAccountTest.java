package bankAccount;

import org.junit.jupiter.api.Test;
import testDrillerAssignment.TestDriller;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {


    @Test

    public void withdrawAndDeposit() {
        BankAccount kelechiAccount = new BankAccount();
        kelechiAccount.deposit(5000);
        kelechiAccount.withdraw(4000);
        assertEquals(5000, kelechiAccount.getBalance());
    }



}