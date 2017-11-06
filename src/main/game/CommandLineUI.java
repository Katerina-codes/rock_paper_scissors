package main.game;

import java.io.*;

public class CommandLineUI {
    private final ByteArrayOutputStream output;
    private final BufferedReader input;

    public CommandLineUI(ByteArrayOutputStream output, InputStream input) {
        this.output = output;
        this.input = new BufferedReader(new InputStreamReader(input));
    }

    public String askForMove() {
        return "Pick your move by typing 'rock', 'paper' or 'scissors': ";
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

    public String annouceWinner(String winningMove) {
        return String.format("%s wins!", winningMove);
    }
}