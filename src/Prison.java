public class Prison extends Field {
    public Prison(int ID, String label, int cost, int income) {
        super(ID, label, cost, income);
    }
    @Override
    public String onAccept(Player p) {
        p.setWildcard = false;
        String msg = "\n Du har kontakter hos politiet og løslades.";
        return super.onAccept(p);
    }

    @Override
    public String onReject(Player p) {
        p.imprison();
        String msg = "\n Du er kommet i fængsel." +
                "\n Næste gang det bliver din tur, kan du vælge, om du vil betale dig ud eller prøve at slå et dobbeltslag." +
                "\n Når du har siddet over i tre omgange, er du løsladt.";
        return super.onReject(p);
    }

    @Override
    public String onLand(Player p){
        String msg = super.onLand(p);
        msg += "\n Du er arresteret og skal i fængsel!";
        if(p.getWildcard() == true){
            msg += "\n Vil du bruge dit wildcard? (Y/N)";
        }
        else{
            p.imprison();
            msg += "\n Næste gang det bliver din tur, kan du vælge, om du vil betale dig ud eller prøve at slå et dobbeltslag." +
                    "\n Når du har siddet over i tre omgange, er du løsladt.";
        }

        return msg;
    }
}
