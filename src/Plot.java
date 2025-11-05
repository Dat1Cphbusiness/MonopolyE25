import java.util.ArrayList;

public class Plot extends Property {


    private int buildings;
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
        if (owner == p && checkForMonopoly()) {
            option = "build";
            msg += "Vil du bygge (Y/N)";
        }
        return msg;


    }

    private boolean checkForMonopoly() {
        int seriesSize = 3;
        ArrayList<Property> deedsInSeries = new ArrayList<>();

        if (seriesID == 1 || seriesID == 5 || seriesID == 10)
        {
            seriesSize = 2;
        } else if (seriesID == 2)
        {
            seriesSize = 4;
        }

        for (Property deed : owner.getDeeds())
        {
            if (deed.seriesID == this.seriesID)
            {
                deedsInSeries.add(deed);
            }
        }

        if (deedsInSeries.equals(seriesSize))
        {
            for (Property deed : deedsInSeries)
            {
                deed.isMonopolized = true;
                return true;
            }
        }

            return false;
    }

    @Override
    public String onAccept(Player p) {
        if(this.option == "build"){

            Bank.withdraw(100,p);
            buildings++;
        }
        return super.onAccept(p);
    }

    @Override
    public String onReject(Player p) {

        return super.onReject(p);
    }


}
