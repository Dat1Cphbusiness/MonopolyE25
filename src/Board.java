import java.lang.reflect.Field;
import java.util.ArrayList;

public class Board {
    private Field[] fields;
    private ArrayList<String> fielddata = new ArrayList<String>();
    private ArrayList<String> carddata = new ArrayList<String>();


    public Board(ArrayList<String> fielddata, ArrayList<String> carddata) {
        this.fielddata = fielddata;
        this.carddata = carddata;
        this.fields= fielddata.length();

        createFields(fielddata);

    }

    private void createFields(ArrayList<String> data) {

    }

    public Field getField(int id) {

    }

}
