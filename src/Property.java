public class Property extends Field {

    private Player owner;
    private int seriesID;
    private boolean isMonopolized;


    public Property(int ID, String label, int cost, int income, int seriesID)
    {
        super(ID,  label,  cost,income);
        this.seriesID = seriesID;
    }

    @Override
    public String toString() {
        return super.toString() + " seriesID: " + seriesID;
    }

    @Override
    public String onLand(Player p) {
        return super.onLand(p);
        //
        // ui.binaryPrompt("Does someone own the property? (Y/N)"

        // if yes then check if owner is currentPlayer
        // if owner is not currentPlayer then Pay

        // if No then prompt if you want to buy, reuse BinaryPrompt
        // if yes then Buy
        // if bought then check if owner has the whole seriesID flag monopolized
        // if no then next players turn



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
