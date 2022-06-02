public class BmiService {
    public float calculate(float a, float b) {
        float c = b / 100;
        float d = c * c;
        float result = a / d;

        return result;
    }
}
