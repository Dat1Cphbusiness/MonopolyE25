public class Chance extends Field{

    private CardDeck cardDeck;

    public Chance(int ID, String label, int cost, int income, CardDeck cardDeck) {
        super(ID, label, cost, income);
        this.cardDeck = cardDeck;
    }
}
