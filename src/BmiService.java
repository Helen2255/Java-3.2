public class BmiService {
    public double calculate(double m, double h) {
        double BodyMassIndex = m / (h * h);
        return BodyMassIndex;
    }
}
