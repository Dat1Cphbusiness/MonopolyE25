public class Tax extends Field{
    public Tax(int ID, String label, int cost, int income) {
        super(ID, label, cost, income);
    }
    @Override
    public String onAccept(Player p) {

         Bank.withdraw(this.getCost(), p);

        return p.getName() + " har betalt " + this.getCost() + " kr i skat!";
    }

    @Override
    public String onReject(Player p) {


            //int amount = p.getTotalWorth() / 10;
            //Bank.withdraw(p, amount);

        //return p.getName() + " har betalt 10% af deres aktiver: " + amount + " kr.";
    }


    @Override
    public String onLand(Player p){

        String s = super.onLand(p);

        s = "\n Du skal betale et beløb der svar til 10% af dine aktiver. Vil du hellere betale et fast beløb på "
                + this.getCost() + "kr? Y/N";


        return s;
    }






}
