package test.game;

import main.game.CommandLineUI;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CommandLineUITest {

    private ByteArrayOutputStream output;
    private  InputStream input;
    private CommandLineUI ui;

    @Before
    public void setUp() {
        output = new ByteArrayOutputStream();
        input = new ByteArrayInputStream("".getBytes());
        ui = new CommandLineUI(new PrintStream(output), input);
    }

    @Test
    public void asksUserForMove() {
        ui.askForMove("Player one" );

        assertTrue(output.toString().contains("Player one pick your move by typing 'rock', 'paper' or 'scissors': \n"));
    }

    @Test
    public void getsMoveFromUser() {
        InputStream input = new ByteArrayInputStream("rock".getBytes());

        CommandLineUI ui = new CommandLineUI(new PrintStream(output), input);

        assertEquals("rock", ui.getMoveFromUser());
    }

    @Test
    public void annouceWinner() {
        ui.announceWinner("rock");

        assertTrue(output.toString().contains("rock wins!\n"));
    }

    @Test
    public void announceDraw() {
        ui.announceWinner("draw");

        assertTrue(output.toString().contains("It's a draw!\n"));
    }

}
