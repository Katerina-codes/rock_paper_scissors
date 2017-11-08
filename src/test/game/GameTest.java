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


    @Before
    public void setUp() {
        inputOutput = new FakeCommandLineUI();
        rockMove = new Rock();
        paperMove = new Paper();
        scissorsMove = new Scissors();
        gameRules = new Rules(rockMove, paperMove, scissorsMove);
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