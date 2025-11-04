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

        if (owner == p && checkMonopoly())
        {
            option = "build";
            msg += "Vil du bygge? (Y/N)";
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

    private boolean checkMonopoly()
    {
        return false;
        // If player/owner has all property with matching series ID
        // Return true
        // Else return false
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
