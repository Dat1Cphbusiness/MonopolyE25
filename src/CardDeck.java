import java.util.Arrays;
import java.util.Collections;

public class CardDeck {
    private Card[] cards;
    private int counter;

    public CardDeck(Card[] cards) {
        this.cards = new Card[cards.length];
        this.counter = 0;
    }
    public Card getNext(){
        if (counter >=  cards.length){
            counter = 0;
        } else {
            counter++;
        }
        return cards[counter];
    }

    public void createCards(String[] data){
        for (int i=1; i<data.length; i++){
            String[] value = data[i].split(",");
            String message = value[0].trim();
            int income = Integer.parseInt(value[1]);
            int cost = Integer.parseInt(value[2]);
            String event = value[3].trim();
            Card c = new Card(message, income, cost, event);
            cards[i-1] = c;
        }
        Collections.shuffle(Arrays.asList(cards));
    }
}
