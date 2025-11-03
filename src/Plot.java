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

        String msg = super.onLand(p);
            if(p == owner && checkForMonopoly() == true){
                option = "build";
                msg += "Vil du bygge en bygning?(Y/N)";
            }



        return msg;

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

    public boolean checkForMonopoly(){

        //hvis owner er == p i alle SeriesID
        return false;
    }


}
