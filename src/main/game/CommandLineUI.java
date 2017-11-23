package main.game;

import java.io.*;
import java.util.HashMap;

import static main.game.Moves.*;

public class CommandLineUI implements UI {
    private final PrintStream output;
    private final BufferedReader input;

    public CommandLineUI(PrintStream output, InputStream input) {
        this.output = output;
        this.input = new BufferedReader(new InputStreamReader(input));
    }

    public void askUserForLanguageSelection() {
        output.println("Select your language:\nEnter '1' for English\nΕισαγάγετε '2' για τα Ελληνικά");
    }

    public String getLanguageSelection() {
        String languageSelection = null;
        try {
            languageSelection = input.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return languageSelection;
    }

    public void askUserForGameMode(Language language) {
        output.println(language.promptMode());
    }

    public void askForMove(Language language, String player) {
        output.println(language.promptMove(player));
    }

    public String getMoveFromUser() {
        String move = null;
        try {
            move = input.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return move;
    }

    public static Moves stringToEnum(String playerMove) {
        HashMap<String, Moves> moves = new HashMap<>();
        moves.put("rock", ROCK);
        moves.put("paper", PAPER);
        moves.put("scissors", SCISSORS);

        return moves.get(playerMove);
    }

    public void announceWinner(Language language, String winningMove) {
        if (winningMove.equals("draw")) {
            output.println(language.announceDraw());
        } else {
            output.println(language.announceWin(winningMove));
        }
    }

    public String getGameMode() {
        String gameMode = null;
        try {
            gameMode = input.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return gameMode;
    }

    public void displayComputerMove(String computerMove) {
        output.println(computerMove);
    }
}