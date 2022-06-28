package paymentTypes;

public interface LoanPayment {
    double calcPayment(double loan, double percent, int loanTermInMonths, int completedPayments);

    default double calcTotalLoanAmount(double loan, double percent) {
        return 0;
    }

    double calcOverpayment(double loan, double percent);
}
