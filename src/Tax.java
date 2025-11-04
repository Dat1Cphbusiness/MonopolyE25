public class Tax extends Field {
    public Tax(int ID, String label, int cost, int income) {
        super(ID, label, cost, income);
    }

    @Override
    public String onAccept(Player p) {
        Bank.withdraw(this.cost,p);
        return super.onAccept(p) + "Der er blevet trukket: " + this.cost;
    }

    @Override
    public String onReject(Player p) {
        int procent = (p.getTotalWorth()/10);
        Bank.withdraw(procent,p);
        return super.onReject(p); + "10 % er blevet trukket fra din saldo: " + procent;
    }

    @Override
    public String onLand(Player p) {
        String s = super.onLand(p); // <- Call the superclass method properly
        return s + "\n Du skal betale et beløb der svarer til 10 % af dine aktiver. Vil du hellere betale et fast beløb på " + this.cost+"kr? Y/N \n";

    }

}
