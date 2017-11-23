package test.game;

import main.game.CommandLineUI;
import main.game.English;
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
    private English english;

    @Before
    public void setUp() {
        output = new ByteArrayOutputStream();
        input = new ByteArrayInputStream("".getBytes());
        ui = new CommandLineUI(new PrintStream(output), input);
        english = new English();
    }

    @Test
    public void askUserForLanguageSelection() {
        ui.askUserForLanguageSelection();

        assertTrue(output.toString().contains("Select your language:\nEnter '1' for English\nΕισαγάγετε '2' για τα Ελληνικά"));
    }

    @Test
    public void getLanguageSelection() {
       InputStream input = new ByteArrayInputStream("1".getBytes());

       CommandLineUI ui = new CommandLineUI(new PrintStream(output), input);

        assertEquals("1", ui.getLanguageSelection());
    }

    @Test
    public void askUserForGameMode() {
        ui.askUserForGameMode(english);

        assertTrue(output.toString().contains("Enter '1' for Human vs. Human\nEnter '2' for Human vs. Computer"));
    }

    @Test
    public void getGameMove() {
        InputStream input = new ByteArrayInputStream("1".getBytes());

        CommandLineUI ui = new CommandLineUI(new PrintStream(output), input);

        assertEquals("1", ui.getGameMode());
    }

    @Test
    public void asksUserForMove() {
        ui.askForMove(english,"Player one");

        assertTrue(output.toString().contains("Player one pick your move by typing"));
        assertTrue(output.toString().contains("rock"));
        assertTrue(output.toString().contains("paper"));
        assertTrue(output.toString().contains("scissors"));
    }

    @Test
    public void getsMoveFromUser() {
        InputStream input = new ByteArrayInputStream("rock".getBytes());

        CommandLineUI ui = new CommandLineUI(new PrintStream(output), input);

        assertEquals("rock", ui.getMoveFromUser());
    }

    @Test
    public void announceWinner() {
        ui.announceWinner(english, "rock");

        assertTrue(output.toString().contains("rock wins!"));
    }

    @Test
    public void announceDraw() {
        ui.announceWinner(english, "draw");

        assertTrue(output.toString().contains("It's a draw!"));
    }

    @Test
    public void displayComputerMove() {
        ui.displayComputerMove("rock");

        assertTrue(output.toString().contains("rock"));
    }

}
