public class Field {

    private  String label;
    private int ID;
    private int cost;
    private int income;
    private String option;

    public Field(int ID, String label, int cost, int income){

    }

    @Override
    public String toString() {
       return "ID: " + ID + " og label: " + label;
    }

    public String onLand(Player p){
        return p + " er landet på " + label;
    }

    public String onAccept(Player p){
        return " ";
    }

    public String onReject(Player p){
        return " ";
    }


}
