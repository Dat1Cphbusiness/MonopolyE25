import java.util.Random;
public class Dice {

    private boolean isDouble;
    private int doubleDiceCounter;

    public boolean getIsDouble() {
        return isDouble;
    }

    public int getDoubleDiceCounter() {
        return doubleDiceCounter;
    }

    int [] diceRoll = new int[2];

    public int rollDiceSum(){
        Random r = new Random();
        diceRoll[0] = r.nextInt(1,7);
        diceRoll[1] = r.nextInt(1,7);

        if(diceRoll[0] == diceRoll[1]) {
            isDouble = true;
            doubleDiceCounter++;
        } else {
            isDouble = false;
            doubleDiceCounter = 0;
        }
        return diceRoll[0] + diceRoll[1];
    }

    public void resetDoubleDiceCounter(){
        doubleDiceCounter = 0;
    }
}
