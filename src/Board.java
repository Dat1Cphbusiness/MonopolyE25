
public class Board {
    private Field[] fields;
    String[] fieldData;
    String[] cardData;

    public Board(String[] fieldData, String[] cardData) {
        fields = new Field[fieldData.length];
        this.fieldData = fieldData;
        this.cardData = cardData;
        createFields(fieldData);
        Chance.cardDeck = new CardDeck(cardData);
    }

    private void createFields(String[] fieldData) {
        for (int i=0; i<fieldData.length; i++){
            String[] values = fieldData[i].split(",");
            int id = Integer.parseInt(values[0].trim());
            String fieldType = values[1].trim();
            String label = values[2].trim();
            int cost = Integer.parseInt(values[3].trim());
            int income = Integer.parseInt(values[4].trim());
            int serieID = Integer.parseInt(values[5].trim());


            Field f = null;
            switch (fieldType){
                case "Start": f = new Start (id, label, cost, income);
                    break;
                case "Plot": f = new Plot (id, label, cost, income, serieID);
                    break;
                case "Chance": f = new Chance (id, label, cost, income);
                    break;
                case "Tax": f = new Tax (id, label, cost, income);
                    break;
                case "ShippingLine": f =  new ShippingLine (id, label, cost, income, serieID);
                    break;
                case "Brewery": f = new Brewery (id, label, cost, income, serieID);
                    break;
                case "Parking": f = new Parking (id, label, cost, income);
                    break;
                case "Visit": f = new Visit (id, label, cost, income);
                    break;
                case "Prison": f = new Prison (id, label, cost, income);
                    break;
                default:
                    System.out.println("No such type available");
            }
            //switch case for at få instantieret de rigtige subtyper

            fields[i] = f;
        }
    }

    public Field getField(int d) {
        return fields[d-1];
    }
}
