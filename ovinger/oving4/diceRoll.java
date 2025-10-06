public class diceRoll {
    public static void main(String[] args){

        Player playerA = new Player();
        Player playerB = new Player();

        System.out.println("      --- 100 Dice game --- \n");
        System.out.println("----------Player A -- Player B --");
        int round = 0;
        String player = "x";

        while (!playerA.isDone() && !playerB.isDone()) {
            playerA.rollDice();
            playerB.rollDice();
            System.out.printf("|Rd: %,3d| Score: %,3d| Score: %,3d| \n", round, playerA.getSumPoints(), playerB.getSumPoints());
            
            round += 1;
        }
        if (playerA.getSumPoints() == 100){
            player = "A";
        }else{
            player = "B";
        }
        System.out.printf("----------Player %s won!---------", player);
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
