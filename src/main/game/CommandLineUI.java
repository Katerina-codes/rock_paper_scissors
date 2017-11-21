package main.game;

import java.io.*;
import java.util.HashMap;

import static main.game.Moves.*;

public class CommandLineUI implements UI {
    private final PrintStream output;
    private final BufferedReader input;
    private English english;

    public CommandLineUI(PrintStream output, InputStream input, English english) {
        this.output = output;
        this.input = new BufferedReader(new InputStreamReader(input));
        this.english = english;
    }

    public void askUserForGameMode() {
        output.println(english.promptMode());
    }

    public void askForMove(String player) {
        output.println(english.promptMove(player));
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

    public void announceWinner(String winningMove) {
        if (winningMove.equals("draw")) {
            output.println(english.announceDraw());
        } else {
            output.println(english.announceWin(winningMove));
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