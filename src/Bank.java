public class Bank {
    private static int balance = 1000000;

    public static void deposit(int amount, Player p){
        if(balance > amount) {
            p.setBalance(p.getBalance() + amount);
            balance = balance - amount;
        }
    }
    public static boolean withdraw(int amount, Player p){
        if(p.getBalance() >= amount){

            p.setBalance(p.getBalance()-amount);
            balance = balance + amount;
            return true;
        }

        return false;
    }

    public static boolean transfer(int amount, Player giver, Player recipient) {
        boolean canPayFullAmount = withdraw(amount, giver);
        if (!canPayFullAmount) {
            amount = giver.getBalance();
            giver.setBalance(giver.getBalance()-amount);
        }
        deposit(amount, recipient);
        return true;
    }


    public static int getBalance() {
        return balance;
    }

    public static void setBalance(int balance) {
        balance = balance;
    }
}
