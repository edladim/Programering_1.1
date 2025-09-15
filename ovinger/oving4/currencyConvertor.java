public class currencyConvertor{
    public static void main(String[] args){

        System.out.println("\n--- Valutakalkulator ---");
        System.out.println("Velg valuta:");
        System.out.println("1: Amerikanske dollar (USD)");
        System.out.println("2: Euro (EUR)");
        System.out.println("3: Svenske kroner (SEK)");
        System.out.println("4: Avslutt");
        System.out.print("Skriv inn ditt valg: ");



    }
}
class currency {

    //Instance field
    private String name;
    private float rate;

    //Constructor
    public currency(String n, float r) {
        name = n;
        rate = r;
    }

    //Methodes
    public String getName(){
        return name;
    }

    public double currencyToNok(double amount) {
        return amount * rate;
    }

    public double nokToCurrency(double amount) {
        return amount / rate;
    }
}

