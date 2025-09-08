import java.util.*; 
public class primeNumber {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        System.out.println("Type any number to check if it is a prime number: ");

        while(true){
            String in = input.nextLine();
            try {
                int number = Integer.parseInt(in);
                if (number == 0){

                }
                System.out.println("Avslutter programmet");
                break
                if 

            } catch (Exception e) {
                System.out.println("Please wright an integer");
            }
        }

        public static boolean isPrime(int n){
            
            if (n <= 1) return false;
            
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        }
    }
}
