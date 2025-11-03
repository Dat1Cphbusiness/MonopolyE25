import java.util.Arrays;
import java.util.Collections;

public class CardDeck {
    private Card[] cards;
    private int counter;

    public CardDeck(String[] carddata) {
        this.cards = new Card[carddata.length];
        this.counter = 0;

    }

    public Card getNext() {
        counter = (counter == cards.length) ? 0 : counter+1;
        return cards[counter];
    }


    private void createCards(String[] data) {
        for (int i = 0; i < data.length; i++) {
            String[] values = data[i].split(",");
            String message = values[0];
            int income = Integer.parseInt(values[1]);
            int cost = Integer.parseInt(values[2]);
            String event = values[3];

            Card c = new Card(message, income, cost, event);
            cards[i] = c;

            Collections.shuffle(Arrays.asList(cards));
        }

    }
}
