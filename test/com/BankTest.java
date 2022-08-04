package com;

import com.account.Account;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankTest {

    private Bank wemaBank;
    @BeforeEach
    public void startWithThis(){
        wemaBank = new Bank();
    }

    @Test
    public void bankExistsTest(){
        Bank wemaBank = new Bank();
        assertNotEquals(null, wemaBank);
        assertNotNull(wemaBank);
    }

    @Test
    public void accountCanBeCreatedTest(){
        wemaBank.createAccountFor("Banke Owolabi", "2727");
        assertEquals(1, wemaBank.getNumberOfCustomers());


    }

    @Test
    public void createAccount_findAccountByAccountNumber(){
        wemaBank.createAccountFor("Banke Owolabi", "2727");
        assertEquals(1, wemaBank.getNumberOfCustomers());

        Account account = wemaBank.findAccount("1");
        assertEquals("Banke Owolabi", account.getName());

    }
    @Test
    public void customerCanDepositInHerAccountTest(){
        wemaBank.createAccountFor("Banke Owolabi", "2727");
        wemaBank.deposit(2_000, "1");

        Account bankeAccount = wemaBank.findAccount("1");
        assertEquals(2_000, bankeAccount.getBalance("2727"));
    }

    @Test
    public void customerCanWithdrawHerMoney(){
        wemaBank.createAccountFor("Banke Owolabi", "2727");
       wemaBank.deposit(2_000, "1");
       wemaBank.withdraw(1_000, "2727", "1");

       Account bankeAccount = wemaBank.findAccount("1");
       assertEquals(1_000, bankeAccount.getBalance("2727"));

    }


}