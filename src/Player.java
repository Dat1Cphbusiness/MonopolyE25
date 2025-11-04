import java.util.ArrayList;

public class Player {
    private String name;
    private int balance;
    private int position;
    private ArrayList<Property> deeds;

    public Player(String name, int balance){
        this.name = name;
        this.balance = balance;
        deeds = new ArrayList<>();
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

    public void setPosition(int i) {
        this.position = i;
    }

    public boolean buyProperty(Property pf){
        Bank.withdraw(pf.getCost(), this);
        deeds.add(pf);
        return true;
    }

    public int getTotalWorth(){
        int totalWorth = balance;
        for (int i=0; i<deeds.size(); i++){
            totalWorth += deeds.get(i).getCost();
        }
        return totalWorth;
    }
}
