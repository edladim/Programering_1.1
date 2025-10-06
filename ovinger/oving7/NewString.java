public class NewString {
    
    // Instance field
    private String str;

    // Constructor 
    public NewString(String str) {
        this.str = new String(str);
    }

    // Methodes
    // Returns a StringBuilder containing the first letter of each word in the string
    public StringBuilder abbreviation(){
        String[] words = str.split(" ");

        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word.charAt(0));
        }
        return sb;
    }

    // Returns a new string with all occurrences of the specified character removed
    public String removeChar(char c) {
        return str.replace(String.valueOf(c), "");
    }
}
