public class Property extends Field {
    private Player owner;
    private int seriesID;
    private boolean isMonopolized;

    public Property(int ID, String label, int cost, int income, int seriesID) {
        super(ID, label, cost, income);
        this.seriesID = seriesID;
    }

    @Override
    public String toString() {
        return super.toString()+seriesID;
    }

    @Override
    public String onLand(Player p) {
        return super.onLand(p);



        // metode "landOnProperty"
        //if en person ejer egendommen
        // Ja - er ejeren "currentplayer?" - hvis ikke så "pay"
        // Nej - Muligheden for at købe egendommen
        // Hvis ejeren ejer serien så marker alle seriens felter som "monopolized"
    }
}
