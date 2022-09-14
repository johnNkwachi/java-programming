package bankAccount;

public class BankAccount {

    private double balance;

    // default constructor (initial private variable to 0)
    public BankAccount(){
        balance = 0;
    }

    // mutators constructor ( take on value from outsider)
    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount){
        balance += amount;  // the balance will be increased by amount. (balance = balance + amount)
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance(){
        return balance;
    }

}
