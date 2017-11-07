package test.game;

import main.game.Game;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GameTest {

    @Test
    public void userIsPromptedForInput() {
        FakeCommandLineUI inputOutput = new FakeCommandLineUI();

        Game newGame = new Game(inputOutput);

        newGame.runGame();

        assertTrue(inputOutput.askForMoveWasCalled());
    }

    @Test
    public void getsMoveFromUser() {
        FakeCommandLineUI inputOutput = new FakeCommandLineUI();

        Game newGame = new Game(inputOutput);

        newGame.runGame();

        assertTrue(inputOutput.getMoveFromUserWasCalled());
    }

    @Test
    public void winnerIsAnnounced() {
        FakeCommandLineUI inputOutput = new FakeCommandLineUI();

        Game newGame = new Game(inputOutput);

        newGame.runGame();

        assertTrue(inputOutput.announceWinnerWasCalled());
    }
}