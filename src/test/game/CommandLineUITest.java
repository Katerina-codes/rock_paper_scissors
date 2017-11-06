package test.game;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;
import main.game.CommandLineUI;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;

public class CommandLineUITest {

    @Test
    public void asksUserForMove() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        InputStream input = new ByteArrayInputStream("".getBytes());

        CommandLineUI ui = new CommandLineUI(output, input);

        assertEquals("Pick your move by typing 'rock', 'paper' or 'scissors': ", ui.askForMove());
    }

    @Test
    public void getsMoveFromUser() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        InputStream input = new ByteArrayInputStream("rock".getBytes());

        CommandLineUI ui = new CommandLineUI(output, input);

        assertEquals("rock", ui.getMoveFromUser());
    }

    @Test
    public void annoucesWinner() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        InputStream input = new ByteInputStream();

        CommandLineUI ui = new CommandLineUI(output, input);

        assertEquals("rock wins!", ui.annouceWinner("rock"));
    }

}
