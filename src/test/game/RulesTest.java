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
}
