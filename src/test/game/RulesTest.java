package test.game;

import main.game.Rock;
import main.game.Rules;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RulesTest {

    @Test
    public void sameMoveEqualsDraw() {
        Rock rockMove = new Rock();
        Rules rules = new Rules(rockMove);

        String result = rules.scoreGame("rock", "rock");

        assertEquals("draw", result);
    }

    @Test
    public void paperBeatsRock() {
        Rock rockMove = new Rock();
        Rules rules = new Rules(rockMove);


        String result = rules.scoreGame("rock", "paper");

        assertEquals("paper", result);
    }

    @Test
    public void rockBeatsScissors() {
        Rock rockMove = new Rock();
        Rules rules = new Rules(rockMove);


        String result = rules.scoreGame("rock", "scissors");
        String resultTwo = rules.scoreGame("scissors", "rock");

        assertEquals("rock", result);
        assertEquals("rock", resultTwo);
    }

    @Test
    public void scissorsBeatsPaper() {
        Rock rockMove = new Rock();
        Rules rules = new Rules(rockMove);

        String result = rules.scoreGame("paper", "scissors");

        assertEquals("scissors", result);
    }
}
