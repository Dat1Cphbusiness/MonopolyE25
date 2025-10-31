import util.FileIO;
import util.TextUI;

import java.util.ArrayList;
import java.util.Collections;


public class Game {

    private String name;
    private int maxPlayers;
    private ArrayList<Player> players;
    private Player currentPlayer;
    TextUI ui = new TextUI();
    FileIO io = new FileIO();


    public Game(String name, int maxPlayers) {
        this.name = name;
        this.maxPlayers = maxPlayers;
        players = new ArrayList<>();
    }


    public void startSession() {
        ui.displayMsg("Welcome to the game.");
        ArrayList<String> data = io.readData("data/playerData.csv");
        if (!data.isEmpty() && ui.promptBinary("Continue previously saved game? Y/N")) {
            for (String s : data) {
                String[] values = s.split(",");//  "tess, 0"
                int score = Integer.parseInt(values[1].trim());
                createPlayer(values[0], score);
            }

        } else {
            registerPlayers();
        }
        displayPlayers();
    }


    public void registerPlayers() {

        int totalPlayers = ui.promptNumeric(" Tast antal deltagere: ");
        if (totalPlayers <= maxPlayers && totalPlayers > 1) {

            while (this.players.size() < totalPlayers) {
                String playerName = ui.promptText("Tast spiller navn");
                this.createPlayer(playerName, 0);
            }
            Collections.shuffle(players);
        } else {

            ui.displayMsg("Eroor. Enter a number between 2 and 6");
            registerPlayers();
        }

    }


    private void createPlayer(String name, int score) {
        Player p = new Player(name, score);
        players.add(p);
    }

    public void displayPlayers() {
        for (Player p : players) {
            System.out.println(p);
        }

    }

    public void endSession() {
        ArrayList<String> playerData = new ArrayList<>();

        //serialiserer player objekterner
        for (Player p : players) {

            String s = p.toString();
            playerData.add(s);

        }
        io.saveData(playerData, "data/playerData.csv", "Name, Score");
    }

    public void runGameLoop() {
        int count = 0;
        boolean continueGame = true;
        while (continueGame == true) {
            currentPlayer = players.get(count);
            count++;
            ui.displayMsg("'It is " + currentPlayer.getName() + "'s turn ");
            if (count >= players.size()) {
                count = 0;

            }


        }
    }
}