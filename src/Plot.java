public class Plot extends Property {

    public Plot(int ID, String label, int cost, int income, int seriesID) {
        super(ID, label, cost, income, seriesID);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String onLand(Player p) {

        String genericMessage = super.onLand(p);
        String specificMessage = genericMessage+ " vil du købe?";



        return specificMessage;

        // if owner is current player
        //if yes continue
        //else no
        // if field is monopolized
        // if yes continue
        //else no
        //does player want accept option to build?
        // if yes then Build
        //else no

    }

    @Override
    public String onAccept(Player p) {
        return super.onAccept(p);
    }

    @Override
    public String onReject(Player p) {

        return super.onReject(p);
    }


}
