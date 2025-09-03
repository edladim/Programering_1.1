import java.util.*; 

public class multiplicationTable {
    public static void main(String[]args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Which part of the multiplicationTable do you want to view? \nPlease write in the format \"number-number\""); 

        String year = input.nextLine();

        String[] calculation = year.split("[ |-|,|.]");

        for (String number:calculation)
            
            System.out.println(number);


        input.close();
    }

}