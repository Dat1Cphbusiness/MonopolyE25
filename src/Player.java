import java.util.ArrayList;

public class Player {
    private String name;
    private int balance;
    private int position;
    private ArrayList<Property> deeds = new ArrayList<>();
    private boolean inPrison;
    private boolean hasWildcard;
    private int lastDiceRoll;

    public Player(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return name + ", " + balance;// "Tine, 3000"
    }


    public String getName() {
        return this.name;
    }

    public int updatePosition(int value) {
        this.lastDiceRoll = value;
        this.position = this.position + value;

        if (this.position > 40) {
            this.position = this.position - 40;
            Bank.deposit(4000, this);
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

    public boolean buyProperty(Property pf) {
        Bank.withdraw(pf.cost, this);
        deeds.add(pf);
        return true; // elaborate later
    }

    public int getTotalWorth() {
        int netWorth = 0;
        for (Property p : deeds) {
            netWorth += p.cost;
        }
        netWorth += this.balance;
        return netWorth;
    }

    public void moveToPosistion(int value) {
        this.position = /*(this.position+)*/value;
    }

    public void imprison() {
        inPrison = true;
        moveToPosistion(31);
    }

    public void freeFromPrison() {
        inPrison = false;
    }

    public boolean getHasWildcard() {
        return hasWildcard;
    }

    public void setHasWildcard(boolean value) {
        this.hasWildcard = value;
    }

    public int getLastDiceRoll() {
        return lastDiceRoll;
    }
}