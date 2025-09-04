import java.util.*; 

public class multiplicationTable {
    public static void main(String[]args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Which part of the multiplicationTable do you want to view?"); 
        String numbers = input.nextLine();

        String[] calculation = numbers.split("[-|.|*|x|,]");
        int number1 = Integer.parseInt(calculation[0]);
        int number2 = Integer.parseInt(calculation[1]);

        multiplication(number1, number2);
       
        input.close();
    }

    public static void multiplication(int number1, int number2){
        for (int i = 0; i <= number2 - number1; i++){
            int number = number1 + i;
            System.out.println("\n" + number + "-table:");
            for (int j = 1; j <= 10; j++){
                System.out.println(number + " * " + j + " = " + number * j);
            }
        }
    }   
}