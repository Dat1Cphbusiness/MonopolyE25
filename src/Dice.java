public class Dice {
    private int[] diceRoll= new int[2];
    private boolean isDouble;
    private int doubleDiceCounter;

    public boolean isDouble() {
        return isDouble;
    }

    public void setDouble(boolean aDouble) {
        isDouble = aDouble;
    }

    public int getDoubleDiceCounter() {
        return doubleDiceCounter;
    }

    public void setDoubleDiceCounter(int doubleDiceCounter) {
        this.doubleDiceCounter = doubleDiceCounter;
    }

    public int[] getDiceRoll() {
        return diceRoll;
    }

    public void setDiceRoll(int[] diceRoll) {
        this.diceRoll = diceRoll;
    }
    public int rollDiceSum(){
        diceRoll[0] = (int)(Math.random()*6+1);
        diceRoll[1] = (int)(Math.random()*6+1);
        if(diceRoll[0] == diceRoll[1]){
            isDouble = true;
            doubleDiceCounter++;
        }else{
            isDouble = false;
            resetDoubleDiceCounter();
        }
        return diceRoll[0] + diceRoll[1];

    }
    public void resetDoubleDiceCounter(){
        doubleDiceCounter = 0;
    }
}
