package main.game;

import static main.game.Moves.PAPER;
import static main.game.Moves.ROCK;

public class Rock implements Move {

    @Override
    public String scoreAgainst(Moves playerTwoMove) {
        if (playerTwoMove.equals(PAPER)) {
            return PAPER.getMove();
        } else {
            return ROCK.getMove();
        }
    }
}
