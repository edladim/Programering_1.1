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
        int iterationCounter = 0;

        for (int number : numbers){
            int rounded = (int) (Math.round(number / 10.0) * (iterations / 100));
            int numberOfStars = (rounded / (iterations / 100));

            StringBuilder stars = new StringBuilder();
            for (int i = 0; i < numberOfStars; i++) {
                stars.append("*");
            }

            String starsString = stars.toString();
            System.out.printf("%d occurred %-3d times %s \n", iterationCounter, number, starsString);

            iterationCounter++;
        }
        System.out.println("------- Done -------");
    }
}

