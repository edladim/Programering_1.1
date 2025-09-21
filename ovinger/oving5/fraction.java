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
    public void add(Fraction fractionToAdd) {
        int newNumerator = this.numerator * fractionToAdd.denominator + fractionToAdd.numerator * this.denominator;
        int newDenominator = this.denominator * fractionToAdd.denominator;

        this.numerator = newNumerator;
        this.denominator = newDenominator;
    }




}
