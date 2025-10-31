import util.FileIO;
import util.TextUI;

import java.util.ArrayList;
import java.util.Collections;


public class Game {

    private String name;
    private int maxPlayers;
    private ArrayList<Player> players;
    TextUI ui = new TextUI();
    FileIO io = new FileIO();
    Player currentPlayer;
    private Board b;

    public Game(String name, int maxPlayers){
        this.name = name;
        this.maxPlayers = maxPlayers;
        players = new ArrayList<>();
    }


    public void startSession(){
        ui.displayMsg("Welcome to the game.");
        ArrayList<String> data = io.readData("data/playerData.csv");
        if(!data.isEmpty() && ui.promptBinary("Continue previously saved game? Y/N")){
            for(String s : data){
                String[] values =  s.split(",");//  "tess, 0"
                int score = Integer.parseInt(values[1].trim());
                createPlayer(values[0],score);
            }

        }else{
            registerPlayers();
        }
        displayPlayers();
        buildBoard();


    }

 private void buildBoard(){

     String[] carddata = io.readData("data/carddata.csv",33);
     String[] fielddata = io.readData("data/fielddata.csv", 40);

     //System.out.println("tester card data: "+carddata[0]);
     //System.out.println("tester card data: "+fielddata[0]);

    b = new Board(fielddata, carddata);


 }

    public void registerPlayers(){
        int totalPlayers = 1;
        ui.displayMsg("Hvor mange deltager?");

        while(totalPlayers < 2 || totalPlayers > 6){
            totalPlayers = ui.promptNumeric("Tast et tal (min 2 og max "+this.maxPlayers+")");
        }

        while(players.size() < totalPlayers) {
            String playerName = ui.promptText("Tast spiller navn");
            this.createPlayer(playerName, 0);
        }
        Collections.shuffle(players);

    }


    private void createPlayer(String name, int score){
        Player p = new Player(name, score);
        players.add(p);
    }
    public void displayPlayers(){
        for(Player p:players){
            System.out.println(p);
        }

    }


    public void runGameLoop(){

        int count = 0;
        boolean continueGame = true;
        while (continueGame) {
            if (count == players.size()) {
                count = 0;
            }
            this.currentPlayer = players.get(count);
            count++;

            throwAndMove();

            continueGame = ui.promptBinary("Forsæt? (Y/N)");
        }
    }

    private void throwAndMove() {
        if (endsWithS()) {
            ui.displayMsg("Det er " + currentPlayer.getName() + "' tur");
        } else {
            ui.displayMsg("Det er " + currentPlayer.getName() + "'s tur");
        }



        Field f =  b.getField(40);


        String message = f.onLand(currentPlayer);
        System.out.println(message);
    }

    private void landAndAct() {

    }

    private boolean endsWithS(){
        int n = currentPlayer.getName().length();
        char last = currentPlayer.getName().charAt(n-1);
        if(last == 's' || last == 'S'){
           return true;
        }else {
            return false;
        }
    }


    public void endSession() {
        ui.displayMsg("Spillet blev afsluttet af "+currentPlayer.getName());
        ArrayList<String> playerData = new ArrayList<>();
        //serialiserer player objekterner
        for(Player p: players){
            String s = p.toString();//"Tine, 3000"
            playerData.add(s);
        }
       io.saveData(playerData, "data/playerData.csv", "Name, Score");
    }

}