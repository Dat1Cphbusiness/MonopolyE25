public class Player {
    private String name;
    private int balance;
    private int position;
    
    public Player(String name, int balance){
        this.name = name;
        this.balance = balance;
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

        if(this.position > 40){
            this.position = this.position - 40;
            Bank bank = new Bank();
            bank.deposit(4000, this);
        }

        return this.position;
    }

    public int getBalance() {

        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;


    }

    public void moveToPosition(int value) {
        position=value;


    }

    public boolean imprison(){
       boolean inPrison = true;
       moveToPosition(31);
       return inPrison;

    }
    public boolean freeFromPrison () {
        boolean inPrison= false;
        return inPrison;
    }
    public boolean getWildcard(){
        return hasWildcard();
    }
    public void setWildcard(boolean value){
        hasWildcard = value;

    }

}
