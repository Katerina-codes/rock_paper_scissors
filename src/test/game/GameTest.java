package test.game;

import main.game.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class GameTest {

    private FakeCommandLineUI inputOutput;
    private Rock rockMove;
    private Paper paperMove;
    private Scissors scissorsMove;
    private Rules gameRules;
    private Game newGame;
    private English englishLanguage;
    private Greek greekLanguage;


    @Before
    public void setUp() {
        inputOutput = new FakeCommandLineUI();
        rockMove = new Rock();
        paperMove = new Paper();
        scissorsMove = new Scissors();
        gameRules = new Rules(rockMove, paperMove, scissorsMove);
        englishLanguage = new English();
        greekLanguage = new Greek();
        newGame = new Game(inputOutput, gameRules, englishLanguage, greekLanguage);
    }

    @Test
    public void askUserForLanguageType() {
        newGame.getLanguageSelection();

        assertTrue(inputOutput.askUserForLanguageSelectionWasCalled());
    }

    @Test
    public void getLanguageSelectionFromUser() {
        newGame.getLanguageSelection();

        assertTrue(inputOutput.getLanguageSelectionWasCalled());
    }

    @Test
    public void getEnglishLanguage() {
        assertEquals(englishLanguage, newGame.selectLanguage("1"));
    }

    @Test
    public void getGreekLanguage() {
        assertEquals(greekLanguage, newGame.selectLanguage("2"));
    }

    @Test
    public void askUserForGameMode() {
        newGame.getGameMode(englishLanguage);

        assertTrue(inputOutput.askUserForGameModeWasCalled());
    }

    @Test
    public void getGameMode() {
        newGame.getGameMode(englishLanguage);

        assertTrue(inputOutput.getGameModeWasCalled());
    }

    @Test
    public void userIsPromptedForInput() {
        newGame.runGame(englishLanguage, "1");

        assertTrue(inputOutput.askForMoveWasCalled());
    }

    @Test
    public void getsMoveFromUser() {
        newGame.runGame(englishLanguage, "1");

        assertTrue(inputOutput.getMoveFromUserWasCalled());
    }

    @Test
    public void convertsRockMoveToEnglish() {
        assertEquals("rock", newGame.convertToEnglish("πέτρα"));
    }

    @Test
    public void convertsPaperMoveToEnglish() {
        assertEquals("paper", newGame.convertToEnglish("χαρτί"));
    }

    @Test
    public void convertsScissorsMoveToEnglish() {
        assertEquals("scissors", newGame.convertToEnglish("ψαλίδι"));
    }

    @Test
    public void displayComputerMoveWasCalled() {
        newGame.runGame(englishLanguage, "2");

        assertTrue(inputOutput.displayComputerMoveWasCalled());
    }

    @Test
    public void winnerIsAnnounced() {
        newGame.runGame(englishLanguage, "1");

        assertTrue(inputOutput.announceWinnerWasCalled());
    }

    @Test
    public void winnerIsFound() {
        newGame.runGame(englishLanguage, "1");

        assertEquals("draw", inputOutput.resultAnnouncedWas());
    }
}