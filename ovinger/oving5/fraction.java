public class Fraction {

    // Instance fields
    private int numerator;
    private int denominator;

    // Constructors
    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction(int numerator) {
        this(numerator, 1);
    }

    // Methods
    // Getter methods
    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    // Method to add two fractions
    public void add(Fraction other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;

        this.numerator = newNumerator;
        this.denominator = newDenominator;
    }

    // Method to subtract two fractions
    public void subtract(Fraction other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;

        this.numerator = newNumerator;
        this.denominator = newDenominator;
    }

    // Method to multiply two fractions
    public void multiply(Fraction other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;

        this.numerator = newNumerator;
        this.denominator = newDenominator;
    }

    //Method to divide two fractions
    public void divide(Fraction other) {
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;

        this.numerator = newNumerator;
        this.denominator = newDenominator;
    }

}
