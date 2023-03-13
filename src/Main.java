public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int bmi = service.calculate(65.0, 1.72);
        System.out.println(bmi);
    }
}