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
    public void getsModeHumanVsHuman() {
        newGame.getPlayerTwoMove(englishLanguage, CommandLineUI.HUMAN_VS_HUMAN);

        assertTrue(inputOutput.modeIsHumanVsHumanWasCalled());
    }

    @Test
    public void userIsPromptedForInput() {
        newGame.runGame(englishLanguage, CommandLineUI.HUMAN_VS_HUMAN);

        assertTrue(inputOutput.askForMoveWasCalled());
    }

    @Test
    public void getsMoveFromUser() {
        newGame.runGame(englishLanguage, CommandLineUI.HUMAN_VS_HUMAN);

        assertTrue(inputOutput.getMoveFromUserWasCalled());
    }

    @Test
    public void winnerIsAnnounced() {
        newGame.runGame(englishLanguage, CommandLineUI.HUMAN_VS_HUMAN);

        assertTrue(inputOutput.announceWinnerWasCalled());
    }

    @Test
    public void winnerIsFound() {
        newGame.runGame(englishLanguage, CommandLineUI.HUMAN_VS_HUMAN);

        assertEquals("draw", inputOutput.resultAnnouncedWas());
    }
}