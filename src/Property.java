import java.util.ArrayList;

public class Property extends Field {

    protected Player owner;
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
        String msg = super.onLand(p);
        if (owner == null){
            option = "buy";
            msg += "Vil du købe (Y/N)";
        } else {
            if (owner != p) {
                msg += "Du skal betale " + income + " til " + owner;
                Bank.transfer(income, p, owner);
            }
        }
        return msg;

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
