import java.util.*; //importerer et input bibliotek

public class sekunderTilTid {

    public static void main(String[]args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Gjør om tid til sekunder!\n \"Skriv inn antall sekunder: "); 

        int tid = input.nextInt();

        int timer = tid / 3600;
        int minutter = (tid % 3600) / 60;
        int sekunder = tid % 60;
    
        System.out.print(tid + "sekunder er det samme som " + timer + " timer " + minutter + " minutter " + sekunder + "sekunder");

    }
}