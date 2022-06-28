package paymentTypes;

public class DifferentiatedLoanPayment implements LoanPayment {
    private static final int CONST_VALUE = 2;

    @Override
    public double calcPayment(double loan, double percent, int loanTermInMonths, int completedPayments) {
        return 0;
    }

    @Override
    public double calcOverpayment(double loan, double percent) {
        return 0;
    }
}