import java.util.Arrays;
import java.util.Collections;

public class CardDeck {
    private Card[] cards;
    private int counter;

    public CardDeck(String[] data) {
        this.cards = new Card[data.length];
        this.counter = 0;
        createCards(data);
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
        for (int i=0; i<data.length; i++){
            //"Ryk tre felter frem;0;0;moveSteps"
            String[] value = data[i].split(";");
            String message = value[0].trim();
            int income = Integer.parseInt(value[1]);
            int cost = Integer.parseInt(value[2]);
            String event = value[3].trim();
            Card c = new Card(message, income, cost, event);
            cards[i] = c;
        }
        Collections.shuffle(Arrays.asList(cards));
    }
}
