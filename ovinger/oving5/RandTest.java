public class RandTest {
    public static void main(String[] args) {
        Rand Rand = new Rand();

        for (int i = 0; i < 10; i++) {
            System.out.println(Rand.nxtInteger(10, 20));
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(Rand.nxtDouble(5.0, 15.0));
        }
    }
}
