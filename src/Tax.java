public class Tax extends Field implements IOption{


    public Tax(int ID, String label, int cost, int income) {
        super(ID, label, cost, income);
    }

    @Override
    public String onAccept(Player p){
        return super.onAccept(p);
    }

    @Override
    public String onReject(Player p){
        return super.onReject(p);
    }

}
