

public class Tax extends Field{
    public Tax(int ID, String label, int cost, int income) {
        super(ID, label, cost, income);
    }
    @Override
    public String onLand(Player p){
        String s = super.onLand(p)+ "\n Du skal betale et beløb der svarer til 10% af dine aktiver. " +
                "Vil du hellere betale et fast beløb på " +
                this.cost+"kr? Y/N \n";;
         this.option = "Tax";
        return s;
    }

    @Override
    public String onAccept(Player p) {

        Bank.withdraw(this.cost, p);
        return "Banktransfer succesfuldt";
    }

    @Override
    public String onReject(Player p) {

        int amount = (int) (p.getTotalWorth()*0.1);
        Bank.withdraw(amount,p);

        return amount+" er blevet trukket fra din konto.";
    }
}
