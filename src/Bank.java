public class Bank {
    private static int balance = 1000000;

    public static void deposit(int amount, Player p){
        if(balance > amount) {
            p.setBalance(p.getBalance() + amount);
            balance = balance - amount;
        }
    }

    public static boolean withdraw(int amount, Player p){

        if(p.getBalance() >= amount){        //Har ændret > til >= så kontoen kan gå i 0

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
    public static void transfer(int amount, Player sender, Player reciver){
        boolean canPayFullAmount = Bank.withdraw(amount, sender);
        if (!canPayFullAmount){
            amount = sender.getBalance();
            Bank.withdraw(amount, sender);
        }
        Bank.deposit(amount, reciver);
    }
}
