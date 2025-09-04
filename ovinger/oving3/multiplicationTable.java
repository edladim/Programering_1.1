import java.util.*; 

public class multiplicationTable {
    public static void main(String[]args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Which part of the multiplicationTable do you want to view?"); 

        String numbers = input.nextLine();

        String[] calculation = numbers.split("[ |-|,|.|*|x]");

        int number1 = Integer.parseInt(calculation[0]);
        int number2 = Integer.parseInt(calculation[1]);

        multiplication(number1);
        multiplication(number2);
       
        input.close();
    }

    public static void multiplication(int number){
        System.out.println("\n" + number + " table");
        for (int i = 1; i <= 10; i++){
            System.out.println(number + " * " + i + " = " + number * i);
        }
    }
}