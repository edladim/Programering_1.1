import java.util.*; 
import java.lang.Math;

public class kiloPrice {
    
    public static void main(String[]args){

        HashMap<String, double[]> grocerys= new HashMap<>();

        grocerys.put("grocery_a", new double[] {35.90, 450.0});
        grocerys.put("grocery_b", new double[] {39.5, 500.0});

        double grocery_a_price = calculator(grocerys.get("grocery_a")[0], grocerys.get("grocery_a")[1]);
        double grocery_b_price = calculator(grocerys.get("grocery_b")[0], grocerys.get("grocery_b")[1]);
        double price_gap = Math.round(Math.abs((grocery_a_price - grocery_b_price) * 100.0) / 100.0);
        
        if (grocery_a_price < grocery_b_price){
            System.out.println("Grocery A is the cheapest with a kilo price of: " + grocery_a_price + " kr/kg\nThe price gap is " + price_gap + " kr");
        } else{
            System.out.println("Grocery B is the cheapest with a kilo price of: " + grocery_b_price + " kr/kg\nThe price gap is " + price_gap + " kr" + grocery_a_price);

        }


    }

    static double calculator(double price, double weight){ 

        double kiloPrice = Math.round(price / weight * 1000 * 100.0) / 100.0;

        return kiloPrice; 
    }
}
