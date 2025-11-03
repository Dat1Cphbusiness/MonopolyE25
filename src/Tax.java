public class Tax extends Field{

    public Tax(int ID, String label, int cost, int income) {
        super(ID, label, cost, income);
    }
    @Override
    public String onAccept(Player p) {
        Bank.withdraw(cost,p);
        return p.getName()+" er blevet trukket "+cost+" kr.";
    }

    @Override
        public String onReject(Player p) {
        Bank.withdraw(p.getTotalWorth*0.1, p);
        return p.getName() + "bliver trukket 10% fra sin værdier";
    }
    public String onLand(Player p){
        String s = super.onLand(p) + "\n Du skal betale et beløb der svarer til 10% af dine aktiver. " +
                "Vil du hellere betale et fast beløb på " + this.cost + "kr? \n";

        return s;
    }
}
