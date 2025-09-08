import java.util.*; 
public class primeNumber {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        while(true){
            System.out.print("Type a number to check if it is a prime number or type 0 to quit the program: ");
            String in = input.nextLine();
            try {
                int number = Integer.parseInt(in);
                if (number == 0){
                    System.out.println("Quitting program");
                    break;
                }

                if (isPrime(number)){
                    System.out.println(number + " is a prime number.");
                }else{
                    System.out.println(number + " is not a prime number.");
                }

            }catch (Exception e) {
                System.out.println("Please wright an integer");
            }
        }
        input.close();
    }
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
