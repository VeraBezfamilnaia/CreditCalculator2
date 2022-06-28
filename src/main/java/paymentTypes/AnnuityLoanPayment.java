package paymentTypes;

public class AnnuityLoanPayment implements LoanPayment {
    @Override
    public double calcPayment(double loan, double percent, int loanTermInMonths, int completedPayments) {
        return 0;
    }

    @Override
    public double calcOverpayment(double loan, double percent) {
        return 0;
    }
}

