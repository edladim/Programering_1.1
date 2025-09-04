import java.util.*; 

public class multiplicationTable {
    public static void main(String[]args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Which part of the multiplicationTable do you want to view?"); 
        String factors = input.nextLine();

        String[] calculation = factors.split("[-|.|*|x|,]");
        int start = Integer.parseInt(calculation[0]);
        int end = Integer.parseInt(calculation[1]);

        multiplication(start, end);
       
        input.close();
    }

    public static void multiplication(int start, int end){
        for (int factor = start; factor <= end; factor++){
            System.out.println("\n" + factor + "-table:");
            for (int multiplier = 1; multiplier <= 10; multiplier++){
                System.out.println(factor + " * " + multiplier + " = " + factor * multiplier);
            }
        }
    }   
}