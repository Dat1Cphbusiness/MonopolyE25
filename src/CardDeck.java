import java.util.Arrays;
import java.util.Collections;

public class CardDeck {
    private Card[] cards;
    private int counter;


    public CardDeck(String[] carddata) {
        this.counter = 0;
        cards = new Card[carddata.length];
        createcards(carddata);
    }

    public Card getNext() {
        counter++;

        if (counter == cards.length) {
            counter = 0;
        }
        return cards[counter];

    }

    public void createcards(String[] data) {
        for (int i = 0; i < data.length; i++) {
            String[] values = data[i].split(",");//"Ryk tre felter frem;0;0;moveSteps"
            String message = values[0];
            int income = Integer.parseInt(values[1].trim());
            int cost = Integer.parseInt(values[2].trim());
            String event = values[3].trim();
            Card c = new Card(message, income, cost, event);
        }
        Collections.shuffle(Arrays.asList(cards));
    }
}
