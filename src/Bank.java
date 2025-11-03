public class Bank {
    private int balance = 1000000;

    public void deposit(int amount, Player p){

       int newAmount = p.getBalance();
        newAmount += amount;
        p.setBalance(newAmount);
        balance -= amount;
    }

    public boolean withDraw(int amount, Player p){

            if(p.getBalance()>amount) {
                p.setBalance(amount+p.getBalance());
                balance+=amount;
                return true;

            }
           return false;
    }

    public int getBalance() {
        return balance;
    }


}
