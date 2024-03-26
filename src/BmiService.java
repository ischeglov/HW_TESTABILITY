public class BmiService {

    public int calculate(double heightMeters, double weightKg) {
        return (int) (weightKg / Math.pow(heightMeters, 2));
    }
}
