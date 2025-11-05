import java.util.ArrayList;

public class Player {
    private String name;
    private int balance;
    private int position;
    private ArrayList<Property> deeds;
    ArrayList<Card> chanceCards;
    boolean hasWildcard;
    private int diceRoll;


    public Player(String name, int balance, boolean hasWildcard){
        this.name = name;
        this.balance = balance;
        this.hasWildcard = hasWildcard;
    }

    @Override
    public String toString(){
        return name + ", "+ balance;// "Tine, 3000"
    }


    public String getName(){
        return this.name;
    }

    public int updatePosition(int value){

        this.position =  this.position + value;
        diceRoll = value;
        if(this.position > 40){
            this.position = this.position - 40;
            Bank bank = new Bank();
            bank.deposit(4000, this);
        }
        return this.position;
    }

    public int getDiceRoll(){
        return diceRoll;
    }

    public int getBalance() {

        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setPosition(int i) {
        this.position = i;
    }

   public boolean buyProperty(Property pf){
    return true;
    }

    private boolean startPassed(){
        return false;
    }

    public void moveToPosition(int value){
        this.position = value;
    }

    public boolean imprison(){

        moveToPosition(31);
        return true;
    }

    public boolean freeFromprison(){
      return false;
    }

    public boolean getWildcard() {
        return hasWildcard;
    }
        public void setWildcard ( boolean value){
            hasWildcard = value;

    }
    public boolean isHasWildcard() {
        return hasWildcard;
    }

    public void setHasWildcard(boolean hasWildcard) {
        this.hasWildcard = hasWildcard;
    }
}
