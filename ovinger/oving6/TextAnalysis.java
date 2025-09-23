class TextAnalysis {

    // Instance field
    private int[] sumCharacters = new int[30];
    private String alphabet = "abcdefghijklmnopqrstuvwxyzæøå";

    

    // Constructor
    TextAnalysis(String text){
        text = text.toLowerCase();
        for (int i = 0; i < text.length(); i++){
            char character = text.charAt(i);
            int index = alphabet.indexOf(character);

            if (alphabet.indexOf(character) != -1) {
                this.sumCharacters[index]++;
            }
            else {
                this.sumCharacters[29]++;
            }
        }
    }

    // Methodes
    // Amount of different characters
    public int differentChar(){
        int total = 0;
        for (int i = 0; i < 29; i++) {
            if (0 < sumCharacters[i]) total++;
        }
        return total;
    }

    // Total characters
    public int totalChar(){
        int total = 0;
        for (int i = 0; i < 29; i++) {
            total += sumCharacters[i];
        }
        return total;
    }

    // Amount of non letter characters in percentage
    public int nonCharPct(){
        int total = totalChar() + sumCharacters[29];
        return (sumCharacters[29] * 100) / total;
    }

    // Amount of chosen character
    public int occurrencesOf(char x){
        int index = alphabet.indexOf(Character.toLowerCase(x));
        if (alphabet.indexOf(x) != -1) return sumCharacters[index];
        return 0;
    }

    // Character that occurrs most often
    public String mostOccurrs() {
        int max = 0;
        for (int i = 0; i < 29; i++) {
            if (max < sumCharacters[i]) max = sumCharacters[i];
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 29; i++) {
            if (max == sumCharacters[i]) sb.append(alphabet.charAt(i)).append(" ");
        }    
        return sb.toString();
    }

}