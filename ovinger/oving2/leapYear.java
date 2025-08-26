import java.util.*; 

public class leapYear {
    public static void main(String[]args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Type in a year: "); //Printer ut en overskrift og et felt hvor man kan skrive inn antall tommer

        int year = input.nextInt();
        
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println(year + " er et skuddår");
        } else {
            System.out.println(year + " er ikke et skuddår"); 
        } 

    }

}
