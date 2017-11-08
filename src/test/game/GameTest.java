package test.game;

import main.game.Game;
import main.game.Rock;
import main.game.Rules;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class GameTest {

    @Test
    public void userIsPromptedForInput() {
        FakeCommandLineUI inputOutput = new FakeCommandLineUI();
        Rock rockMove = new Rock();
        Rules gameRules = new Rules(rockMove);

        Game newGame = new Game(inputOutput, gameRules);

        newGame.runGame();

        assertTrue(inputOutput.askForMoveWasCalled());
    }

    @Test
    public void getsMoveFromUser() {
        FakeCommandLineUI inputOutput = new FakeCommandLineUI();
        Rock rockMove = new Rock();
        Rules gameRules = new Rules(rockMove);

        Game newGame = new Game(inputOutput, gameRules);

        newGame.runGame();

        assertTrue(inputOutput.getMoveFromUserWasCalled());
    }

    @Test
    public void winnerIsAnnounced() {
        FakeCommandLineUI inputOutput = new FakeCommandLineUI();
        Rock rockMove = new Rock();
        Rules gameRules = new Rules(rockMove);

        Game newGame = new Game(inputOutput, gameRules);

        newGame.runGame();

        assertTrue(inputOutput.announceWinnerWasCalled());
    }

    @Test
    public void winnerIsFound() {
        FakeCommandLineUI inputOutput = new FakeCommandLineUI();
        Rock rockMove = new Rock();
        Rules gameRules = new Rules(rockMove);

        Game newGame = new Game(inputOutput, gameRules);

        newGame.runGame();

        assertEquals("draw", inputOutput.resultAnnouncedWas());
    }
}