public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        float height = 150; // в сантиметрах
        float weight = 80;  // в килограммах
        float bmi = service.calculate(weight, height);

        System.out.println("Индекс массы тела:" + bmi);
    }
}
