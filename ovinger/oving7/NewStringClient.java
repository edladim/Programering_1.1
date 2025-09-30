public class NewStringClient {
    public static void main(String[] args) {
        NewString myString = new NewString("Hello, World!");
        
        StringBuilder abbreviations = myString.abbreviation();
        String withoutChar = myString.removeChar('o');
        System.out.println(abbreviations);
        System.out.println(withoutChar);
    }
}
