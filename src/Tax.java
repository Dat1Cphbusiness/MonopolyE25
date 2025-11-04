public class Tax extends Field{
    public Tax(int ID, String label, int cost, int income) {
        super(ID, label, cost, income);
    }
    @Override
    public String onAccept(Player p) {
        Bank.withdraw(this.cost, p);
        return super.onAccept(p) + p + "Har lige betalt: " + this.cost + " Din nuværende saldo er nu: " + p.getBalance();

    }

    @Override
    public String onReject(Player p) {
        //int tenPercent = p.getTotalWorth()*0.1;
        //Bank.withdraw(tenPercent, p);
        return p + " har lige betalt: " +/*tenPercent + */  " Din nuværende saldo er nu: " + p.getBalance();
    }

    @Override
    public String onLand(Player p) {
        String s = super.onLand(p) + "\n Du skal betale et beløb der svarer til 10% af dine aktiver. Vil du hellere betale et fast beløb på " +this.cost+"kr Y/N \n";
        return s;
    }

}
