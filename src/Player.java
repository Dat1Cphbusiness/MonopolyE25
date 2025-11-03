public class Player {
    private String name;
    private int score;
    private int position;
    
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

    public void setBalance(int amount){
        score = amount;

    }

    public int getBalance(){

        return this.score;
    }

    public int updatePosition(int value) {
        if(position+value >= 40) {
            int newPosition = position+value - 40;
            Bank b = new Bank();
            Player
            b.deposit(4000,);
            this.score = this.score + 4000;
            return newPosition;
        }else {
            return position + value;
        }
    }

}
