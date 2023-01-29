public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double mass = 53; // вес человека в килограммах
        double height = 1.6; // рост в метрах
        double BmiService = service.calculate(53, 1.6);
        System.out.println("Ваш имт:" + BmiService);
    }
}
