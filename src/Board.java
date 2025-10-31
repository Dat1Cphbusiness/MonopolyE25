import com.sun.jdi.Field;

public class Board {
    private Field[] fields;




    public Board(String[] fielddata, String [] carddata){
        this.fields = new Field[fielddata.length];
        createFields(fielddata);
    }



        private void createFields(String[] data){

        for(int i=0; i<data.length;i++){
            String[] values = data[i].split(",");
            int Field = Integer.parseInt(values[i].trim());
        }


        }
        public Field getField (int id){

        return fields[id];
        }
}
