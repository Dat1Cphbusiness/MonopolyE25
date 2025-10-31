
public class Board {
    private Field[] fields;
    String[] fieldData;
    String[] cardData;

    public Board(String[] fieldData, String[] cardData) {
        fields = new Field[cardData.length];
        this.fieldData = fieldData;
        this.cardData = cardData;
        createFields(fieldData);
    }

    private void createFields(String[] fieldData) {
        for (int i=0; i<fieldData.length; i++){
            String[] values = fieldData[i].split(",");
            int id = Integer.parseInt(values[0].trim());
            String type = values[1].trim();
            String name = values[2].trim();
            int cost = Integer.parseInt(values[3].trim());
            int income = Integer.parseInt(values[4].trim());
            int serieID = Integer.parseInt(values[5].trim());
            Field a = new Field(id,type,name,cost,income,serieID);
            fields[i] = a;
        }
    }

    public Field getField(int d) {
        return fields[d-1];
    }
}
