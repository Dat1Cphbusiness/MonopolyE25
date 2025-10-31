public class Property extends Field{

    private Player owner;
    private int serieID;
    private boolean isMonopolized;

    public Property(int ID, String label, int cost, int income, int serieID) {
        super(ID, label, cost, income);
        this.serieID = serieID;
    }

    @Override
    public String onLand(Player p) {
        return super.onLand(p);
        // Når du lander på et felt, skal den afgøre om der er en ejer.
        // Er det nuværende spiller der ejer denne? Hvis nej, skal man betale til ejer.
        // Hvis ja, skal man tage stilling til om man vil købe eller ikke.
        // Hvis ejer har en komplet serie skal felterne markeres som monopolized.
    }

    @Override
    public String toString() {
        return super.toString() + ", " + serieID;
    }
}
