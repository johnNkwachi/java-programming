package chapterFour;

public class CreditLImitCalMain {
    public static void main(String[] args) {
        CreditLimitCalculator creditLimitCalculator = new CreditLimitCalculator(123456, 10000,
                10000, 10000,10000);
        System.out.println(creditLimitCalculator.newBalance(10000));


    }
}
