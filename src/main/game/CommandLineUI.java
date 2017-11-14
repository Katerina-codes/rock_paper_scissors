package main.game;

import java.io.*;
import java.util.HashMap;

import static main.game.Moves.*;

public class CommandLineUI implements UI  {
    private final PrintStream output;
    private final BufferedReader input;

    public CommandLineUI(PrintStream output, InputStream input) {
        this.output = output;
        this.input = new BufferedReader(new InputStreamReader(input));
    }

    public void askForMove(String player) {
        output.println(String.format("%s pick your move by typing 'rock' 💎, 'paper' 📰 or 'scissors' 💇 : ", player));
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
            output.println("It's a draw! 😅");
        } else {
            output.println(String.format("%s wins! 🙌 ", winningMove));
        }
    }
}