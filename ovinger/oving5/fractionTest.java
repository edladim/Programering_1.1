public class fractionTest {
    public static void main(String[] args) {
        Fraction frac1 = new Fraction(1, 2); // Represents 1/2
        Fraction frac2 = new Fraction(3, 4); // Represents 3/4

        System.out.println("Fraction 1: " + frac1.getNumerator() + "/" + frac1.getDenominator());
        System.out.println("Fraction 2: " + frac2.getNumerator() + "/" + frac2.getDenominator());

        // Test addition
        frac1.add(frac2);
        System.out.println("After addition: " + frac1.getNumerator() + "/" + frac1.getDenominator());

        // Reset frac1 for further tests
        frac1 = new Fraction(1, 2);

        // Test subtraction
        frac1.subtract(frac2);
        System.out.println("After subtraction: " + frac1.getNumerator() + "/" + frac1.getDenominator());

        // Reset frac1 for further tests
        frac1 = new Fraction(1, 2);

        // Test multiplication
        frac1.multiply(frac2);
        System.out.println("After multiplication: " + frac1.getNumerator() + "/" + frac1.getDenominator());

        // Reset frac1 for further tests
        frac1 = new Fraction(1, 2);

        // Test division
        frac1.divide(frac2);
        System.out.println("After division: " + frac1.getNumerator() + "/" + frac1.getDenominator());
    }
    
}
