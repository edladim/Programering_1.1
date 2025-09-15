import java.util.*; 

public class diceRoll {
    public static void main(String[] args){

        Player playerA = new Player();
        Player playerB = new Player();

        System.out.println("--- 100 Dice game ---");

        while (!playerA.isDone() && !playerB.isDone()) {
            playerA.rollDice();
            playerB.rollDice();
            System.out.printf("Player A got %,3d points and player B got %,3d points\n", playerA.getSumPoints(), playerB.getSumPoints());
        }
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
        return sumPoints >= 100;
    }
    
    public void rollDice(){
        int diceRoll = dice.nextInt(6) + 1;
        
        if (diceRoll == 1){
            sumPoints = 0;
        }
        else{
            sumPoints += diceRoll;
        }

        /*
        if(sumPoints > 100){
            sumPoints -= diceRoll;
        }
        */
    }
}
