public class Player {
    private String name;
    private int score;
    
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

}
