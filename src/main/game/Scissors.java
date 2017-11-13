package main.game;

import static main.game.Moves.ROCK;
import static main.game.Moves.SCISSORS;

public class Scissors implements Move {

    @Override
    public String scoreAgainst(Moves playerTwoMove) {
        if (playerTwoMove.equals(ROCK)) {
            return ROCK.getMove();
        } else {
            return SCISSORS.getMove();
        }
    }
}
