import java.util.*; 

public class diceRoll {
    public static void main(String[] args){


    }
}

class Player{

    //--- Instance field ---
    private int sumPoints = 0;
    java.util.Random dice = new java.util.Random();

    //--- Methods ---
    public int getSumPoints(){
        return sumPoints;
    }

    public boolean isDone(){
        return sumPoints == 100;
    }
    
    public void rollDice(){
        int diceRoll = dice.nextInt(6) + 1;
        
        if (diceRoll == 1){
            sumPoints = 0;
        }
        else{
            sumPoints += diceRoll;
        }

        if(sumPoints > 100){
            sumPoints -= diceRoll;
        }
    }
}
