import java.util.*; //importerer et input bibliotek

public class tommerTilCm {
    public static void main(String[]args) {

        Scanner input = new Scanner(System.in); //gir input muligheten til å oppdage tastetrykk

        System.out.print("Tommer til centimeter Kalkulator\nTommer: "); //Printer ut en overskrift og et felt hvor man kan skrive inn antall tommer

        double tommer = input.nextDouble(); //gir variabelen tommer verdien som skrives inn
        
        System.out.print(tommer + " tommer er det samme som " + kalkulator(tommer) + " centimeter."); //Sender inn antall tommer til metoden kalkulator og printer ut svaret samt en svartekst
    

        input.close(); //avslutter "scanningen" for å unngå feilmelding

    }

    static double kalkulator(double tommer){ //henter inn tommer
         
        double cm = tommer * 2.54; //gir varabelen cm en verdi tilsvarende antall tommer ganger 2.54
        
        return cm; //returnerer antall cm
    }
}
