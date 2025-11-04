public class Tax extends Field{
    public Tax(int ID, String label, int cost, int income) {
        super(ID, label, cost, income);
    }


    @Override
    public String onLand(Player p) {

        String s = super.onLand(p);

        s = s + "\n Du skal betale et beløb der svarer til 10 % af dine aktiver. Vil du hellere betale et fast beløb på " + this.cost+"kr? (Y/N) \n";

        return s;
    }

    @Override
    public String onAccept(Player p) {
        Bank.withdraw(this.cost,p);
        String msg = super.onAccept(p);
        msg = msg + "Du har valgt at betale et fast beløb og betaler derfor " + this.cost +"kr. til skattestyrelsen.";
        return msg;
    }

    @Override
    public String onReject(Player p) {
        Bank.withdraw(p.getTotalWorth() * 0.1,p);
        String msg = super.onReject(p);
        msg = msg + "Du har valgt at betale 10% af dine aktiver og betaler for " + (p.getTotalWorth() * 0.1) + "kr. til skattestyrelsen";
        return msg;
    }
}
