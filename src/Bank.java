public class Bank {
    private static int balance = 1000000;

    public static void deposit(int amount, Player p){
        if(balance > amount) {
            p.setBalance(p.getBalance() + amount);
            balance = balance - amount;
        }
    }
    public static boolean withdraw(int amount, Player p){

        if(p.getBalance() > amount){

            p.setBalance(p.getBalance()-amount);
            balance = balance + amount;
            return true;
        }

        return false;
    }


    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
