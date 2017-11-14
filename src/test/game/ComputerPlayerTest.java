package test.game;

import main.game.ComputerPlayer;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class ComputerPlayerTest {

    @Test
    public void playRandomMove() {
        ComputerPlayer computer = new ComputerPlayer();

        String[] moves = new String[]{"rock", "paper", "scissors"};

        String move = computer.playRandomMove(moves);

        assertTrue(Arrays.asList(moves).contains(move));
    }
}
