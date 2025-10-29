import util.FileIO;
import util.TextUI;

import java.util.*;
import java.util.ArrayList;


public class Game {

    private String name;
    private int maxPlayers;
    private int minPlayers;
    private Player currentPlayer;
    private ArrayList<Player> players;
    TextUI ui = new TextUI();
    FileIO io = new FileIO();


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
    }



    public void registerPlayers() {

        minPlayers = 2;
        maxPlayers = 6;

        int totalPlayers = ui.promptNumeric("Indtast antal spillere:");

        if (totalPlayers >= minPlayers && totalPlayers <= maxPlayers)
        {
            while(this.players.size() < totalPlayers) {
                String playerName = ui.promptText("Tast spiller navn");
                this.createPlayer(playerName, 0);
            }
            ui.displayMsg("Spillere registreret");

        } else
        {
            ui.displayMsg("Ukorrekt tal, vælg tal mellem 2 og 6.");
            registerPlayers();
        }

        Collections.shuffle(players); // Randomizes list of players


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

    public void endSession() {
        ArrayList<String> playerData = new ArrayList<>();

        //serialiserer player objekterner
        for(Player p: players){

            String s = p.toString();
            playerData.add(s);

        }
       io.saveData(playerData, "data/playerData.csv", "Name, Score");
    }

    public void runGameLoop()
    {
        currentPlayer = players.get(0);
        ui.displayMsg("Spiller " + currentPlayer.getName() + " starter!");
    }
}