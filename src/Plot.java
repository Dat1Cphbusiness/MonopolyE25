public class Plot extends Property{
    public Plot(String label, int ID, int cost, int income) {
        super(label, ID, cost, income);
    }

    @Override
    public String onLand(Player p) {
        return super.onLand(p);
        /*
        Check om owner af feltet er currentplayer.
        Hvis ja, tjek om feltet er monoplized.
        Hvis ja, accepter muligheden for at bygge.
        Hvis ja, kald en byg metode.
         */
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
