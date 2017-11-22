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
    private Language language;


    @Before
    public void setUp() {
        inputOutput = new FakeCommandLineUI();
        rockMove = new Rock();
        paperMove = new Paper();
        scissorsMove = new Scissors();
        gameRules = new Rules(rockMove, paperMove, scissorsMove);
        language = new English();
        newGame = new Game(inputOutput, gameRules, language);
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
    public void askUserForGameMode() {
        newGame.getGameMode();

        assertTrue(inputOutput.askUserForGameModeWasCalled());
    }

    @Test
    public void getGameMode() {
        newGame.getGameMode();

        assertTrue(inputOutput.getGameModeWasCalled());
    }

    @Test
    public void userIsPromptedForInput() {
        newGame.runGame("1");

        assertTrue(inputOutput.askForMoveWasCalled());
    }

    @Test
    public void getsMoveFromUser() {
        newGame.runGame("1");

        assertTrue(inputOutput.getMoveFromUserWasCalled());
    }

    @Test
    public void displayComputerMoveWasCalled() {
        newGame.runGame("2");

        assertTrue(inputOutput.displayComputerMoveWasCalled());
    }

    @Test
    public void winnerIsAnnounced() {
        newGame.runGame("1");

        assertTrue(inputOutput.announceWinnerWasCalled());
    }

    @Test
    public void winnerIsFound() {
        newGame.runGame("1");

        assertEquals("draw", inputOutput.resultAnnouncedWas());
    }
}