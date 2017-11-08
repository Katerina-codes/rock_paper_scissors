package test.game;

import main.game.Paper;
import main.game.Rock;
import main.game.Rules;
import main.game.Scissors;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RulesTest {

    private Rock rockMove;
    private Paper paperMove;
    private Scissors scissorsMove;
    private Rules rules;

    @Before
    public void setUp() {
        rockMove = new Rock();
        paperMove = new Paper();
        scissorsMove = new Scissors();
        rules = new Rules(rockMove, paperMove, scissorsMove);
    }

    @Test
    public void sameMoveEqualsDraw() {
        String result = rules.scoreGame("rock", "rock");

        assertEquals("draw", result);
    }

    @Test
    public void paperBeatsRock() {
        String result = rules.scoreGame("rock", "paper");

        assertEquals("paper", result);
    }

    @Test
    public void rockBeatsScissors() {
        String result = rules.scoreGame("rock", "scissors");
        String resultTwo = rules.scoreGame("scissors", "rock");

        assertEquals("rock", result);
        assertEquals("rock", resultTwo);
    }

    @Test
    public void scissorsBeatsPaper() {
        String result = rules.scoreGame("paper", "scissors");

        assertEquals("scissors", result);
    }
}
