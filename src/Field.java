public class Field {

    public  String label;
    public int ID;
    public int cost;
    public int income;
    public String option;

    public Field( int ID, String label, int cost, int income) {
        this.income = income;
        this.cost = cost;
        this.ID = ID;
        this.label = label;
    }

    @Override
    public String toString() {
       return label + " " +  ID;
    }

    public String onLand(Player p){
        return p.getName() + " er landet på " + this;
    }

    public String onAccept(Player p){
        return " ";
    }

    public String onReject(Player p){
        return " ";
    }


}
