public class Chance extends Field {
    static CardDeck cardDeck;
    Card c;

    public Chance(int ID, String label, int cost, int income) {

        super(ID, label, cost, income);
    }
    public String onLand(Player p) {
        c = cardDeck.getNext();


        switch (c.getEvent()) {
            case "payment":
                Bank.withdraw(c.getCost(), p);
                break;
            case "reward":
                Bank.deposit(c.getIncome(), p);
                break;
            case "prison":
                p.setPosition(11);
                break;
            case "wildcard":
                p.setWildCard(true);
                break;
            case "paymentTimesProperties":
                Bank.withdraw(c.getCost(), p); //Gang getCost med antal huse / hoteller.
                break;
            case "recieveFromPlayers":
                Bank.collectFromPlayers(c.getCost(), p);

        }
        return c.getMessage();
    }



}

