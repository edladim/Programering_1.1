public class NewString {
    
    // Instance field
    private String str;

    // Constructor 
    public NewString(String str) {
        this.str = new String(str);
    }

    // Methodes
    public StringBuilder abbreviation(){
        String[] words = str.split(" ");

        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word.charAt(0));
        }
        return sb;
    }

    public String removeChar(char c) {
        return str.replace(String.valueOf(c), "");
    }

}
