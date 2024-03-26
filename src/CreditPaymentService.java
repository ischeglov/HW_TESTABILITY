
public class CreditPaymentService {

    /**
     *
     * @param amountOfCredit сумма кредита
     * @param interestRate процентная ставка
     * @param creditTerm срок кредита
     * @return расчет ежемесячного платежа
     */
    public int calculate(int amountOfCredit, double interestRate, int creditTerm) {
        double loanRatePerMonth = (interestRate / 12) / 100;
        double annuityCoefficient = (loanRatePerMonth * Math.pow(1 + loanRatePerMonth, creditTerm) /
                (Math.pow(1 + loanRatePerMonth, creditTerm) - 1));
        return (int) (annuityCoefficient * amountOfCredit);
    }
}
