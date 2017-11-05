package test.game;

import main.game.Rules;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RulesTest {

    @Test
    public void sameMoveEqualsDraw() {
        Rules rules = new Rules();

        String result = rules.scoreGame("rock", "rock");

        assertEquals("draw", result);
    }

    @Test
    public void paperBeatsRock() {
        Rules rules = new Rules();

        String result = rules.scoreGame("rock", "paper");

        assertEquals("paper", result);
    }

    @Test
    public void rockBeatsScissors() {
        Rules rules = new Rules();

        String result = rules.scoreGame("rock", "scissors");

        assertEquals("rock", result);
    }

    @Test
    public void scissorsBeatsPaper() {
        Rules rules = new Rules();

        String result = rules.scoreGame("paper", "scissors");

        assertEquals("scissors", result);
    }
}
