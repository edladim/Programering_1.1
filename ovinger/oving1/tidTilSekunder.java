import java.util.*; //importerer et input bibliotek

public class tidTilSekunder {

    static int input(String utskrift) { //input linjer som i pyhton

        Scanner input = new Scanner(System.in);

        System.out.print(utskrift);

        int value = input.nextInt();

        return value;
    }

    static int kalkulator(int timer, int minutter, int sekunder){ 
         
        int totalSek = timer * 3600 + minutter * 60 + sekunder; //regner ut totalt antall sekunder
        
        return totalSek; 
    }

    public static void main(String[]args) {

        System.out.print("Gjør om tid til sekunder!\n"); 

        int timer = input("Timer: ");

        int minutter = input("Minutter: ");

        int sekunder = input("Sekunder: ");
    
        System.out.print(timer + " timer " + minutter + " minutter og " + sekunder + "  sekunder er det samme som " + kalkulator(timer, minutter, sekunder) + " sekunder");

    }
}