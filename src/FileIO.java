/*
*  Utility class to persist the Strings in an ArrayList
*  To use, each object in a list must first be serialized (field values of the object are added to the same String, separated by comma)
*
*  TODO: To avoid leakage, both scanner and FileWriter must be closed, suggestion to use try-with-ressources in both methods
* */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class FileIO {



    public static void saveData(ArrayList<String> list, String path, String header){


        try {

            FileWriter writer = new FileWriter(path);
            writer.write(header+"\n");
            for (String s : list) {
                writer.write(s+"\n");
            }
            writer.close();


        }catch (IOException e) {

            System.out.println("problem: "+ e.getMessage());
        }

    }

    public static ArrayList<String> readData(String path) {
        ArrayList<String> data = new ArrayList<>();
        File file = new File(path);
        try {
            Scanner scan = new Scanner(file);
            scan.nextLine(); // skip header "Name, Score"

            while (scan.hasNextLine()) {
                String line = scan.nextLine();   //  "Egon, 1000000"
                data.add(line);

            }
        } catch (FileNotFoundException e) {
            System.out.println("Filen findes ikke");
        }catch (NoSuchElementException e){
            System.out.println("Filen findes, men den er tom");
        }
        return data;
    }
}
