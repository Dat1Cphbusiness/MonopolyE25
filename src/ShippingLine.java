public class ShippingLine extends Property{
    public ShippingLine(int ID, String label, int cost, int income, int seriesID) {
        super(ID, label, cost, income, seriesID);
    }
    @Override
    public String onLand(Player p) {
        return super.onLand(p);
    }
}

