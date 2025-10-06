public class TextProssesor {

    // Instance field
    private String text;

    // Constructor
    public TextProssesor(String text) {
        this.text = text;
    }

    // Method to get the text
    public String getText() {
        return text;
    }

    // Methode to get the text in uppercase
    public String toUpperCase() {
        return text.toUpperCase();
    }

    // Methode to get the number of words in the text
    public int wordCount() {
        if (text == null || text.isEmpty()) {
            return 0;
        }
        String[] words = text.split("\\s+");
        return words.length;
    }

    // Methode to get average number of words per period
    public double averageWordsPerPeriod() {
        if (text == null || text.isEmpty()) {
            return 0.0;
        }
        String[] periods = text.split("[.!?]+");
        int totalWords = wordCount();
        double average = (double) totalWords / periods.length;
        return average;
    }

    // Methode average word length
    public double averageWordLength() {
        if (text == null || text.isEmpty()) {
            return 0.0;
        }
        String[] words = text.split("\\s+");
        int totalLength = 0;
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (!Character.isLetter(c)) {
                    word = word.substring(0, i) + word.substring(i + 1);
                    i--; // Adjust index after removal
                }
            }
            totalLength += word.length();
        }
        double average = (double) totalLength / words.length;
        return average;
    }

    // Methode to replace a word with another word
    public String replaceWord(String target, String replacement) {
        if (text == null || text.isEmpty()) {
            return text;
        }
        return text.replaceAll(target, replacement);
    }
}