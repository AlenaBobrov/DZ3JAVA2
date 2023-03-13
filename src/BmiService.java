public class BmiService {
    public int calculate(double kgWeight, double metersHeight) {
        double result = kgWeight / (metersHeight * metersHeight);
        return (int) result;
    }
}
