package test.game;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;
import main.game.CommandLineUI;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CommandLineUITest {

    @Test
    public void asksUserForMove() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        InputStream input = new ByteArrayInputStream("".getBytes());

        CommandLineUI ui = new CommandLineUI(new PrintStream(output), input);

        ui.askForMove();

        assertTrue(output.toString().contains("Pick your move by typing 'rock', 'paper' or 'scissors': \n"));
    }

    @Test
    public void getsMoveFromUser() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        InputStream input = new ByteArrayInputStream("rock".getBytes());

        CommandLineUI ui = new CommandLineUI(new PrintStream(output), input);

        assertEquals("rock", ui.getMoveFromUser());
    }

    @Test
    public void annouceWinner() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        InputStream input = new ByteInputStream();

        CommandLineUI ui = new CommandLineUI(new PrintStream(output), input);

        ui.announceWinner("rock");

        assertTrue(output.toString().contains("rock wins!\n"));
    }

    @Test
    public void announceDraw() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        InputStream input = new ByteInputStream();

        CommandLineUI ui = new CommandLineUI(new PrintStream(output), input);

        ui.announceWinner("draw");

        assertTrue(output.toString().contains("It's a draw!\n"));
    }

}
