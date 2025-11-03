public class Chance extends Field {
    static CardDeck cardDeck;

    public Chance(int ID, String label, int cost, int income) {

        super(ID, label, cost, income);
    }
    public String onLand(Player p){
        Card c = cardDeck.getNext();
        return c.getMessage();


    }
}

