public class TextProssesorClient {
    public static void main(String[] args) {
        TextProssesor textProssesor = new TextProssesor("Hello, world! This is a test. Hello again.");
        System.out.println("Original Text: " + textProssesor.getText());
        System.out.println("Uppercase Text: " + textProssesor.toUpperCase());
        System.out.println("Word Count: " + textProssesor.wordCount());
        System.out.println("Average Words per Period: " + textProssesor.averageWordsPerPeriod());
        System.out.println("Average Word Length: " + textProssesor.averageWordLength());
        System.out.println("Replaced Text: " + textProssesor.replaceWord("Hello", "Hi"));
    }
}
