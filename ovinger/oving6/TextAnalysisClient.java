import java.util.Scanner;

public class TextAnalysisClient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter text for analysis: ");
            String text = scanner.nextLine();
            TextAnalysis analysis = new TextAnalysis(text);

            System.out.println("\nDifferent characters: " + analysis.differentChar());
            System.out.println("Total characters: " + analysis.totalChar());
            System.out.println("Non-letter character percentage: " + analysis.nonCharPct() + "%");
            System.out.println("Occurrences of 'e': " + analysis.occurrencesOf('e'));
            System.out.println("Character that occurs most often: " + analysis.mostOccurrs());

            System.out.print("Enter new text for analysis (or type\"0\" to quit): ");
            String quit = scanner.nextLine();
            if (quit.equals("0")) {
                System.out.println("Quitting program ...");
                break;
            }
        }
        scanner.close();
    }
}
