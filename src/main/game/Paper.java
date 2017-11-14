package main.game;

import static main.game.Moves.PAPER;
import static main.game.Moves.SCISSORS;

public class Paper implements Move {

    @Override
    public String scoreAgainst(Moves playerTwoMove) {
        if (playerTwoMove.equals(SCISSORS)) {
            return SCISSORS.getMove();
        } else {
            return PAPER.getMove();
        }
    }
}
