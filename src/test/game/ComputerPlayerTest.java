package test.game;

import main.game.ComputerPlayer;
import main.game.Moves;
import org.junit.Test;

import java.util.Arrays;

import static main.game.Moves.*;
import static org.junit.Assert.assertTrue;

public class ComputerPlayerTest {

    @Test
    public void playRandomMove() {
        ComputerPlayer computer = new ComputerPlayer();

        Moves[] moves = new Moves[]{ROCK, PAPER, SCISSORS};

        Moves move = computer.playRandomMove();

        assertTrue(Arrays.asList(moves).contains(move));
    }
}
