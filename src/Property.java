public class Property extends Field{
    private Player owner;
    private int seriesID;
    boolean isMonopolized;


    public Property(String label, int ID, int cost, int income) {
        super(label, ID, cost, income);
    }

    @Override
    public String onLand(Player p) {
        return super.onLand(p);
        /*If statement der tjekker om en ejer property.
        Hvis ja, tjek om ejeren er currentplayer.
        Hvis nej skal currentplayer betale, hvis ja, sker der ikke noget.
        Hvis property ikke er eget så giv brugeren et valg om at købe den (Y/N).
        Hvis brugeren accepterer købet marker felt som eget af den bruger.
        Derefter tjek med fx if statement om brugeren ejer hele sættet, hvis ja, marker felterne som monopoloized.





         */

    }

    @Override
    public String toString() {
        return super.toString() + seriesID;
    }
}
