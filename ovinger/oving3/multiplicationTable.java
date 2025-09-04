import java.util.*; 

public class multiplicationTable {
    public static void main(String[]args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Which part of the multiplicationTable do you want to view?"); 
        
        boolean approved = false; 
        int start = 0;
        int end = 0;

        do {
            String factors = input.nextLine();
            try {
                String[] calculation = factors.split("[-,\\.]");
                start = Integer.parseInt(calculation[0]);
                end = Integer.parseInt(calculation[1]);
                approved = true;
            } catch (Exception e){
                System.err.println("NB! Your input was not accepted, please write in the format \"NUMBER-NUMBER\"");
            }   
        }
        while (!approved);
    
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