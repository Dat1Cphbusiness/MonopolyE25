public class Field {

    private String label;
    private int ID;
    private int cost;
    private int income;
    private String option;

    public Field(int ID, String label, int cost, int income) {
        this.label = label;
        this.ID = ID;
        this.cost = cost;
        this.income = income;
    }

    public String toString() {
        return ID + label;
    }

    public String onLand(Player p) {
        return p.getName() + " er landet på felt " + ID + ", " + label;
    }

    public String onAccept(Player p) {
        return "placeholder";
    }

    public String onReject(Player p) {
        return "placeholder";
    }

}
