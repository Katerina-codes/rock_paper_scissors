package main.game;

import java.util.HashMap;

import static main.game.Moves.*;

public class Rules {
    private Rock rockMove;
    private Paper paperMove;
    private Scissors scissorsMove;

    public Rules(Rock rockMove, Paper paperMove, Scissors scissorsMove) {
        this.rockMove = rockMove;
        this.paperMove = paperMove;
        this.scissorsMove = scissorsMove;
    }

    public String scoreGame(Moves playerOneMove, Moves playerTwoMove) {
        HashMap<Moves, Move> moves = new HashMap<>();
        moves.put(ROCK, rockMove);
        moves.put(PAPER, paperMove);
        moves.put(SCISSORS, scissorsMove);

        if (playerOneMove.equals(playerTwoMove)) {
            return "draw";
        } else {
            return moves.get(playerOneMove).scoreAgainst(playerTwoMove);
        }
    }
}