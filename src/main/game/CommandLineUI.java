package main.game;

import java.io.*;

public class CommandLineUI implements UI  {
    private final PrintStream output;
    private final BufferedReader input;

    public CommandLineUI(PrintStream output, InputStream input) {
        this.output = output;
        this.input = new BufferedReader(new InputStreamReader(input));
    }

    public void askForMove(String player) {
        output.println(String.format("%s pick your move by typing 'rock', 'paper' or 'scissors': ", player));
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

    public void announceWinner(String winningMove) {
        if (winningMove.equals("draw")) {
            output.println("It's a draw!");
        } else {
            output.println(String.format("%s wins!", winningMove));
        }
    }
}