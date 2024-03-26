public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightMeters = 1.87;
        double weightKg = 98;
        int bmi = service.calculate(heightMeters, weightKg); // должно получиться 28

        System.out.printf("Рост(м): %.2f \n" + "Вес(кг): %.2f \n" + "bmi-индекс: %d",
                heightMeters, weightKg, bmi);
    }
}
