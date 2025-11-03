public class Bank {
        private int balance = 1000000;

        public void deposit(int amount, Player p){
            this.balance-= amount;
            p.setBalance(amount);
        }

        public boolean withdraw(int amount, Player p){
            if (p.getBalance()>=amount){
                int sum =p.getBalance()+amount;
                p.setBalance(sum);
                this.balance += amount;
                return true;
            }else return false;
        }

    /*public boolean transfer(int amount, Player giver, Player recipient){
        if(giver.getBalance()>=amount){

            giver.getBalance-amount;
            recipient.setBalance+amount;
            return true;
        }return false;
    }*/

        public int getBalance(){

            return this.balance;
        }
    }



