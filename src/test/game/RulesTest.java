package test.game;

import main.game.Rules;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RulesTest {

    @Test
    public void sameMoveEqualsDraw() {
        Rules rules = new Rules();

        String result = rules.scoreGame("rock", "rock");

        assertEquals("draw", result);
    }
}
