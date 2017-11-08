package test.game;

import main.game.Game;
import main.game.Rock;
import main.game.Rules;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class GameTest {

    private FakeCommandLineUI inputOutput;
    private Rock rockMove;
    private Rules gameRules;
    private Game newGame;


    @Before
    private void setUp() {
        inputOutput = new FakeCommandLineUI();
        rockMove = new Rock();
        gameRules = new Rules(rockMove);
        newGame = new Game(inputOutput, gameRules);
    }

    @Test
    public void userIsPromptedForInput() {
        newGame.runGame();

        assertTrue(inputOutput.askForMoveWasCalled());
    }

    @Test
    public void getsMoveFromUser() {
        newGame.runGame();

        assertTrue(inputOutput.getMoveFromUserWasCalled());
    }

    @Test
    public void winnerIsAnnounced() {
        newGame.runGame();

        assertTrue(inputOutput.announceWinnerWasCalled());
    }

    @Test
    public void winnerIsFound() {
        newGame.runGame();

        assertEquals("draw", inputOutput.resultAnnouncedWas());
    }
}