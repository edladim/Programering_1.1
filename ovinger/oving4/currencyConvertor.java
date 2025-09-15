import java.util.*; 

public class currencyConvertor{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Currency dollar = new Currency("USD", 10.5);
        Currency euro = new Currency("EUR", 11.2);    
        Currency svenskeKroner = new Currency("SEK", 0.95); 


        while (true) {
            System.out.println("\n--- CurencyConvertor ---");
            System.out.println("Choose a currency:");
            System.out.println("1: American dollar (USD)");
            System.out.println("2: Euro (EUR)");
            System.out.println("3: Svenske kroner (SEK)");
            System.out.println("4: End program");
            System.out.print("Type in your choice: ");

            try {
                int choice = scanner.nextInt();

                if (choice == 4) {
                    System.out.println("--- Quitting program ---");
                    break; // Avslutter programmet
                }

                Currency selectedCurrency = null;
                String selectedCurrencyName = "";

           
                switch (choice) {
                    case 1:
                        selectedCurrency = dollar;
                        selectedCurrencyName = "USD";
                        break;
                    case 2:
                        selectedCurrency = euro;
                        selectedCurrencyName = "EUR";
                        break;
                    case 3:
                        selectedCurrency = svenskeKroner;
                        selectedCurrencyName = "SEK";
                        break;
                    default:
                        System.out.println("Ivalid input, please try agian.");
                        continue;
                }

                System.out.print("Type in amount of " + selectedCurrencyName + ": ");
                double amount = scanner.nextDouble();

                
                double amountInNok = selectedCurrency.currencyToNok(amount);
                System.out.printf("%.2f %s == %.2f NOK.%n", amount, selectedCurrencyName, amountInNok);

            } catch (java.util.InputMismatchException e) {
                System.out.println("Please type a number from 1 to 4.");
                scanner.next(); 
            }
        }
        scanner.close();
    }
}

class Currency {

    //Instance field
    private String name;
    private double rate;

    //Constructor
    public Currency(String name, double rate) {
        this.name = name;
        this.rate = rate;
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

