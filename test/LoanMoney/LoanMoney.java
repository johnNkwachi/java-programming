package LoanMoney;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LoanMoney {

    private double interestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;

    public LoanMoney() {
    }
    public LoanMoney( double interestRate, int numberOfYears, double loanAmount){
            this.interestRate = interestRate;
            this.numberOfYears = numberOfYears;
            this.loanAmount = loanAmount;
            loanDate = new  java.util.Date();
        }

    public double getInterestRate(){
        return interestRate;
    }
    public void setInterestRate(double interestRate){
        this.interestRate = interestRate;
    }
    public void setLoanAmount(double loanAmount){
        this.loanAmount = loanAmount;
    }
    public double getLoanAmount() {
        return loanAmount;
    }
    public Date getLoanDate(){
        this.loanDate = new Date();
        return loanDate;
    }
    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }
    public int getNumberOfYears(){
        return numberOfYears;
    }
    public double getTotalPayment() {
        return (getLoanAmount() * getInterestRate() * getNumberOfYears());
        //return interestRate(8.25);
    }
}