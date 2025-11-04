public class Prison extends Field {
    public Prison(int ID, String label, int cost, int income) {
        super(ID, label, cost, income);
    }
    @Override
    public String onAccept(Player p) {
        p.setWildCard()= false;
        String msg= "\n Du har kontakter hos politiet og løslades. ";

        return super.onAccept(p);
    }

    @Override
    public String onReject(Player p) {
        p.imprison();
        String msg= "\n Næste gang det bliver din tur," +
        " kan du vælge at betale dig ud,´eller prøve at så et dobbletslag." +
                " Når du hat siddet over i tre omgange er du løsladt";

        return super.onReject(p);

    }
    public String onLand(Player p) {
        String msg =  super.onLand(p);
        msg += "\n Du er arresteret, og skal i fængsel";
        if(p.getWildCard() == true){
            msg +="\n Vil du brug dit wildcard? (Y/N) ";
        }else {
          p.imprison();
          msg += "\n Næste gang det bliver din tur," +
                  " kan du vælge at betale dig ud,´eller prøve at så et dobbletslag." +
                  " Når du hat siddet over i tre omgange er du løsladt";
        }
        return msg;

    }
}
