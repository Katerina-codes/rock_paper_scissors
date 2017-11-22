package test.game;

import main.game.Greek;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreekTest {

    @Test
    public void promptForPlayerOne() {
        Greek greek = new Greek();

        assertEquals("Paíktis éna", greek.playerOneType());
    }
}
