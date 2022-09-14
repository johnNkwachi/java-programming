package chapterFour;

public class CreditLimitCalculator {
    int accountNumber;
    int beginningBalance;
    int totalOfItemsPerMonth;
    int totalOfAllCreditApplied;
    int allowedCreditLimit;

    public CreditLimitCalculator(int accountNumber, int beginningBalance, int totalOfItemsPerMonth,
                                 int totalOfAllCreditApplied, int allowedCreditLimit) {
        this.accountNumber = accountNumber;
        this.beginningBalance = beginningBalance;
        this.totalOfItemsPerMonth = totalOfItemsPerMonth;
        this.totalOfAllCreditApplied = totalOfAllCreditApplied;
        this.allowedCreditLimit = allowedCreditLimit;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBeginningBalance() {
        return beginningBalance;
    }

    public void setBeginningBalance(int beginningBalance) {
        this.beginningBalance = beginningBalance;
    }

    public int getTotalOfItemsPerMonth() {
        return totalOfItemsPerMonth;
    }

    public void setTotalOfItemsPerMonth(int totalOfItemsPerMonth) {
        this.totalOfItemsPerMonth = totalOfItemsPerMonth;
    }

    public int getTotalOfAllCreditApplied() {
        return totalOfAllCreditApplied;
    }

    public void setTotalOfAllCreditApplied(int totalOfAllCreditApplied) {
        this.totalOfAllCreditApplied = totalOfAllCreditApplied;
    }

    public int getAllowedCreditLimit() {
        return allowedCreditLimit;
    }

    public void setAllowedCreditLimit(int allowedCreditLimit) {
        this.allowedCreditLimit = allowedCreditLimit;
    }

    public int newBalance(int bal){
       int balance = beginningBalance + totalOfItemsPerMonth - allowedCreditLimit;
        if (balance > allowedCreditLimit){
            System.out.println("Credit limit exceeded");
        }
        return balance;
    }


}
//(Credit Limit Calculator) Develop a Java application that determines whether any of sev-
//        eral department-store customers has exceeded the credit limit on a charge account. For each cus-
//        tomer, the following facts are available:
//        a) account number
//        b) balance at the beginning of the month
//        c) total of all items charged by the customer this month
//        d) total of all credits applied to the customer’s account this month
 //       e) allowed credit limit.

//    The program should input all these facts as integers, calculate the new balance (= beginning balance
//        + charges – credits), display the new balance and determine whether the new balance exceeds the
//        customer’s credit limit. For those customers whose credit limit is exceeded, the program should dis-
//        play the message "Credit limit exceeded" .