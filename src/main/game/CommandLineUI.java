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
}