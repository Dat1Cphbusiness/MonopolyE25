public class Bank {
    private int balance = 1000000;

    public void deposit(int amount, Player p){
        if(balance > amount) {
            p.setBalance(p.getBalance() + amount);
            balance = balance - amount;
        }

    }
    public boolean withdraw(int amount, Player p){
        boolean enoughMoney = true;
        if(getBalance() < amount){
            enoughMoney = false;
        }

        return enoughMoney;
    }
    public boolean transfer(int amount, Player giver, Player recipient){
        boolean enoughMoney = true;
        if(giver.getBalance() < amount){
            enoughMoney = false;
        }
        return enoughMoney;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
