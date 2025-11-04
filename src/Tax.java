public class Tax extends Field{
    public Tax(int ID, String label, int cost, int income) {
        super(ID, label, cost, income);
    }

    @Override
    public String onAccept(Player p) {
       Bank.withdraw(this.cost, p);
       String message = p.getName() + " har betalt " + this.cost + " kr. til banken. Ny saldo: " + p.getBalance() + "kr.";
        System.out.println(message);
        return message;
    }

    @Override
    public String onReject(Player p) {
        Bank.withdraw(p.getTotalWorth()*0.1,p);
        String message = p.getName()+ " har betalt "+p.getTotalWorth()*0.1+"kr. Til banken. Den nye saldo: "+ p.getBalance() + "kr.";
        return message;
    }

    @Override
    public String onLand(Player p){
        String s = super.onLand(p);
        System.out.println("\n Du skal betale et beløb der svarer til 10 % af dine aktiver. Vil du hellere betale et fast beløb på "+this.cost+"kr? Y/N \n");
        return s;
    }

}
