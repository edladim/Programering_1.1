import java.util.Random;

public class InstanceCounter {
    public static void main(String[] args) {
        Random random = new Random();

        int iterations = 1000;
        int[] numbers = new int[10];

        for (int i = 0; i < 1000; i++) {
            int rand = random.nextInt( 10);
            numbers[rand]++;
        }

        System.out.println("- INSTANCE COUNTER -");
        iterations = 0;
        for (int number : numbers){
            System.out.printf("%d occurred %-3d times \n", iterations, number);
            iterations++;
        }
        System.out.println("------- Done -------");
    }
}

