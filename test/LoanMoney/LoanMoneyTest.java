package LoanMoney;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoanMoneyTest {
   private LoanMoney johnLoan;

    @BeforeEach
    void setUp() {
        johnLoan = new LoanMoney(8.25, 1, 1000);
        }

    @Test
    public void johnLoanCantBeNull(){
        assertNotNull(johnLoan);
    }

    @Test
    public void checkLoanAmount(){
        johnLoan.getLoanAmount();
        assertEquals(1000, johnLoan.getLoanAmount());

    }


    @Test
    public void getAnnualInterestRate(){
        //johnLoan.interestRate(8.25);
        johnLoan.setInterestRate(8.25);
        assertEquals(8.25, johnLoan.getInterestRate());

    }
    @Test
    public void testPayBackAfterYears(){
        johnLoan.setLoanAmount(1000);
        johnLoan.setInterestRate(8.25);
        johnLoan.setNumberOfYears(1);
        double amountPaidBack = johnLoan.getTotalPayment();
        assertEquals(8250, amountPaidBack);
    }
}