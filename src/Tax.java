import util.TextUI;

public class Tax extends Field{
    TextUI ui= new TextUI();
    Bank bank= new Bank();
    public Tax(int ID, String label, int cost, int income) {
        super(ID, label, cost, income);
    }
    @Override
    public String onAccept(Player p) {
        bank.withdraw(cost, p);

        return "Banken har taget: "+cost+ " fra "+p+" som skat.";
    }

    @Override
    public String onReject(Player p) {
        int skat= p.getTotalWorth()*0.1;
        bank.withdraw(skat, p);

        return "du har betalt 10% af " + p.getTotalWorth() + " som svare til " + skat + "kr.";
    }
    public String onLand(Player p) {
       String s = super.onLand(p);
        ui.displayMsg("`\n Du skal betale et beløb der svarere til 10% af dine aktiver. " +
                "\n Vil du hellere betale et fast beløb på "+ this.cost + "kr? Y/N \n");
        return s;


    }
}
