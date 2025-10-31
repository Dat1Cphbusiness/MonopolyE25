public class Plot extends Property {



    public Plot(int ID, String label, int cost, int income, int seriesID) {
        super(ID, label, cost, income, seriesID);


    }

    @Override
    public String onLand(Player p) {
        //hvis ejer er currentPlayer, feltet er monopoliseret, og spilleren accepterer:
        //build
        return super.onLand(p);
    }

}
