public class Plot extends Property {

    public Plot(int ID, String label, int cost, int income, int serieID) {
        super(ID, label, cost, income, serieID);
    }

    @Override
    public String onLand(Player p) {
        return super.onLand(p);

        // Spiller lander på en Plot. Find ud af om Player ejer plot.
        // Hvis "ja", spørg Player om de vil bygge på Plot,
        // hvis "ja", byg på Plot.
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
