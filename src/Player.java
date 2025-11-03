public class Player {
    private String name;
    private int score;
    private int position;
    private int balance;
    
    public Player(String name, int score){
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString(){
        return name + ", "+ score;// "Tine, 3000"
    }


    public String getName(){
        return this.name;
    }


    public int updatePosition(int value){
        this.position+=value;
        if(this.position > 40){
            this.position=this.position-40;
            this.balance+=4000;
            return this.position;
        }
            return this.position;

    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
