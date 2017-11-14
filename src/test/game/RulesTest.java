package test.game;

import main.game.*;
import org.junit.Before;
import org.junit.Test;

import static main.game.Moves.*;
import static main.game.Result.DRAW;
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
        String result = rules.scoreGame(ROCK, ROCK);

        assertEquals(DRAW.getResult(), result);
    }

    @Test
    public void paperBeatsRock() {
        String result = rules.scoreGame(ROCK, PAPER);

        assertEquals(PAPER.getMove(), result);
    }

    @Test
    public void rockBeatsScissors() {
        String result = rules.scoreGame(ROCK, SCISSORS);
        String resultTwo = rules.scoreGame(SCISSORS, ROCK);

        assertEquals(ROCK.getMove(), result);
        assertEquals(ROCK.getMove(), resultTwo);
    }

    @Test
    public void scissorsBeatsPaper() {
        String result = rules.scoreGame(PAPER, SCISSORS);

        assertEquals(SCISSORS.getMove(), result);
    }
}
