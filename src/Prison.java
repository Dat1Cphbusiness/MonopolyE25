public class Prison extends Field {
    public Prison(int ID, String label, int cost, int income) {
        super(ID, label, cost, income);
    }

    @Override
    public String onLand(Player p) {
        String msg = super.onLand(p);
        msg += "\n Du er arresteret, og skal i fængsel";
        if (getWildcard()){
            msg += "\n Vil du bruge dit wildcard (Y/N)";
        } else if (getWildcard() == false) {
            imprison();
            msg += "\n Næste gang det bliver din tur, " +
                    "kan du vælge om du vil betale dig ud eller prøvae at slå et dobbeltslag. " +
                    "Når du har siddet over i tre omgange er du løsladt";
        }
        return msg;
    }

    @Override
    public String onAccept(Player p) {
        setWildcard(false);
        String msg = "\n Du har kontakter hos politiet og løslades";
        return msg;
    }

    @Override
    public String onReject(Player p) {
        imprison();
        String msg = "\n Næste gang det bliver din tur, " +
                "kan du vælge om du vil betale dig ud eller prøvae at slå et dobbeltslag. " +
                "Når du har siddet over i tre omgange er du løsladt";
        return msg;
    }
}
