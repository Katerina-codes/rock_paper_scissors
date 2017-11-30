package test.game;

import main.game.CommandLineUI;
import main.game.English;
import main.game.Greek;
import main.game.Language;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CommandLineUITest {

    public static final String GREEK = "2";
    private ByteArrayOutputStream output;
    private  InputStream input;
    private CommandLineUI ui;
    private English englishLanguage;

    @Before
    public void setUp() {
        output = new ByteArrayOutputStream();
        input = new ByteArrayInputStream("".getBytes());
        ui = new CommandLineUI(new PrintStream(output), input);
        englishLanguage = new English();
    }

    @Test
    public void askUserForLanguageSelection() {
        ui.askUserForLanguageSelection();

        assertTrue(output.toString().contains("Select your language:\nEnter '" + CommandLineUI.ENGLISH + "' for English\nΕισαγάγετε '2' για τα Ελληνικά"));
    }

    @Test
    public void createsEnglishLanguage() {
        InputStream input = new ByteArrayInputStream(CommandLineUI.ENGLISH.getBytes());

        CommandLineUI ui = new CommandLineUI(new PrintStream(output), input);

        assertEquals(English.class, ui.getLanguage().getClass());
    }

    @Test
    public void createsGreekLanguage() {
        InputStream input = new ByteArrayInputStream(GREEK.getBytes());

        CommandLineUI ui = new CommandLineUI(new PrintStream(output), input);

        assertEquals(Greek.class, ui.getLanguage().getClass());
    }

    @Test
    public void askUserForGameMode() {
        ui.askUserForGameMode(englishLanguage);

        assertTrue(output.toString().contains("Enter '1' for Human vs. Human\nEnter '2' for Human vs. Computer"));
    }

    @Test
    public void getGameMode() {
        InputStream input = new ByteArrayInputStream(CommandLineUI.HUMAN_VS_HUMAN.getBytes());

        CommandLineUI ui = new CommandLineUI(new PrintStream(output), input);

        assertEquals(CommandLineUI.HUMAN_VS_HUMAN, ui.getGameMode());
    }

    @Test
    public void testIfGameModeIsHumanVsHuman() {
        assertEquals(true, ui.modeIsHumanVsHuman(CommandLineUI.HUMAN_VS_HUMAN));
    }

    @Test
    public void asksUserForMove() {
        ui.askForMove(englishLanguage,"Player one");

        assertTrue(output.toString().contains("Player one pick your move by typing"));
        assertTrue(output.toString().contains("rock"));
        assertTrue(output.toString().contains("paper"));
        assertTrue(output.toString().contains("scissors"));
    }

    @Test
    public void getsMoveFromUser() {
        InputStream input = new ByteArrayInputStream("rock".getBytes());

        CommandLineUI ui = new CommandLineUI(new PrintStream(output), input);

        assertEquals("rock", ui.getMoveFromUser(englishLanguage));
    }

    @Test
    public void getsMoveFromUserWhenLanguageIsGreek() {
        InputStream input = new ByteArrayInputStream("πέτρα".getBytes());

        CommandLineUI ui = new CommandLineUI(new PrintStream(output), input);
        Language greekLanguage = new Greek();

        assertEquals("rock", ui.getMoveFromUser(greekLanguage));
    }

    @Test
    public void announceWinner() {
        ui.announceWinner(englishLanguage, "rock");

        assertTrue(output.toString().contains("rock wins!"));
    }

    @Test
    public void announceDraw() {
        ui.announceWinner(englishLanguage, "draw");

        assertTrue(output.toString().contains("It's a draw!"));
    }

    @Test
    public void displayComputerMove() {
        ui.displayComputerMove("rock");

        assertTrue(output.toString().contains("rock"));
    }

}
