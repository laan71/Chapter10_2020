import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LoanTest {

    @Test
    void getAnnualInterestRate() {
        Loan loan1 = new Loan();
        assertEquals(2.5, loan1.getAnnualInterestRate());
    }

    @Test
    void setAnnualInterestRate() {
        Loan loan2 = new Loan();
        loan2.setAnnualInterestRate(2.5);
        assertEquals(2.5, loan2.getAnnualInterestRate());
    }

    @Test
    void getNumberOfYears() {
        Loan loan3 = new Loan();
        assertEquals(1, loan3.getNumberOfYears());
    }

    @Test
    void setNumberOfYears() {
        Loan loan4 = new Loan();
        loan4.setNumberOfYears(1);
        assertEquals(1, loan4.getNumberOfYears());
    }

    @Test
    void getLoanAmount() {
        Loan loan5 = new Loan();
        assertEquals(10000, loan5.getLoanAmount());
    }

    @Test
    void setLoanAmount() {
        Loan loan6 = new Loan();
        loan6.setLoanAmount(10000);
        assertEquals(10000, loan6.getLoanAmount());
    }

    @Test
    void getMonthlyPayment() {
        Loan loan7 = new Loan();
        assertEquals(1041.666666666667, loan7.getMonthlyPayment());

    }
    @Test
    void getTotalPayment() {
        Loan loan8 = new Loan();
        assertEquals(125000, loan8.getTotalPayment());
    }

    // This method can´t be tested
    @Test
    void getLoanDate() {
        Loan loan9 = new Loan();
        assertEquals(10, loan9.getLoanDate());
    }
}
