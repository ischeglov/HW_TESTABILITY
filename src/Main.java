public class Main {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int monthlyPaymentOneYear = service.calculate(1_000_000, 9.99,
                12); // 87911
        int monthlyPaymentTwoYears = service.calculate(1_000_000, 9.99,
                24); // 46140
        int monthlyPaymentThreeYears = service.calculate(1_000_000, 9.99,
                36); //32262

        System.out.printf("Ежемесячный платеж: %d; Cрок кредита: один год \n" +
                        "Ежемесячный платеж: %d; Cрок кредита: два года  \n" +
                        "Ежемесячный платеж: %d; Cрок кредита: три года",
                monthlyPaymentOneYear, monthlyPaymentTwoYears, monthlyPaymentThreeYears);
    }
}
