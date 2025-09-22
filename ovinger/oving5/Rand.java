import java.util.Random;
public class Rand {

    // Instance field
    private Random rand;

    // Constructor
    public Rand() {
        this.rand = new Random();
    }

    // Methodes
    // Random Int
    public int nxtInteger(int lower, int upper) {
        if (upper < lower) {
            throw new IllegalArgumentException("The upper limit must be heiger than the lower limit.");
        }

        return rand.nextInt(upper - lower) + lower;
    }

    // Random doubble
    public double nxtDouble(double lower, double upper) {
        if (upper < lower) {
            throw new IllegalArgumentException("The upper limit must be heiger than the lower limit.");
        }

        return rand.nextDouble(upper - lower) + lower;
    }
}
