public class NewStringClient {
    public static void main(String[] args) {
        NewString myString = new NewString("Hello, World!");
        // You can add method calls to myString here to test its functionality
        StringBuilder abbreviations = myString.abbreviation();
        System.out.println(abbreviations);
        
    }
}
