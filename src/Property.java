

public class Property extends Field {

    protected Player owner;
    protected int seriesID;
    protected boolean isMonopolized;

    public Property(int ID, String label, int cost, int income, int seriesID) {
        super(ID, label, cost, income);
        this.seriesID = seriesID;
    }

    @Override
    public String toString() {
        return super.toString() + " seriesID: " + seriesID;
    }

    @Override
    public String onLand(Player p) {
        String msg = super.onLand(p);
        if (owner == null) {

            option += "buy";
            msg += "Vil du købe? (Y/N)";

        }else if (owner != p) {
                msg += "Du skal betale " + income + " til " + owner;
                Bank.transfer(income, p, owner);
        }



        return msg;


    }

    @Override
    public String onAccept(Player p) {
        String msg = "";
        if(this.option.equals("buy")){
            p.buyProperty(this);
            msg = p.getName()+" har nu købt "+this;

        }
        return msg;
    }

    @Override
    public String onReject(Player p) {
        return super.onReject(p);
    }
}
