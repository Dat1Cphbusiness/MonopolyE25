import util.FileIO;
import util.TextUI;

import java.util.ArrayList;
import java.util.Collections;


public class Game {

    private String name;
    private int maxPlayers;
    private ArrayList<Player> players;
    private int totalPlayers = 0;
    private int minPlayers = 2;
    TextUI ui = new TextUI();
    FileIO io = new FileIO();


    public Game(String name, int maxPlayers){
        this.name = name;
        this.maxPlayers = maxPlayers;
        players = new ArrayList<>();
    }


    public void startSession(){
        ui.displayMsg("Velkommen til Matador!");
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
    }



    public void registerPlayers(){
        while (invalidNumberOfPlayers()) {
            totalPlayers = ui.promptNumeric("Tast antal Spillere");

            if (invalidNumberOfPlayers()) {
                ui.displayMsg("Vælg mellem " + minPlayers + " og " + maxPlayers + " spillere.");
            }
        }

        while(this.players.size() < totalPlayers) {
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
        for(Player p : players){
            System.out.println(p);
        }

    }

    public void endSession() {
        ArrayList<String> playerData = new ArrayList<>();

        //serializer player objekterne
        for(Player p: players){

            String s = p.toString();
            playerData.add(s);

        }
       io.saveData(playerData, "data/playerData.csv", "Name, Score");
    }

    public void runGameLoop() {
        Player currentPlayer = players.getFirst();
        ui.displayMsg("Det er " + currentPlayer.getName() + " der skal spille.");
    }

    private boolean invalidNumberOfPlayers() {
        return totalPlayers < minPlayers || totalPlayers > maxPlayers;
    }
}