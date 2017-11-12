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

    public String scoreGame(String playerOneMove, String playerTwoMove) {
        HashMap<String, Move> moves = new HashMap<>();
        moves.put("rock", rockMove);
        moves.put("paper", paperMove);
        moves.put("scissors", scissorsMove);

        if (playerOneMove.equals(playerTwoMove)) {
            return "draw";
        } else {
            return moves.get(playerOneMove).scoreAgainst(playerTwoMove);
        }
    }

    public String scoreGame(Moves playerOneMove, Moves playerTwoMove) {
        if (playerOneMove.equals(playerTwoMove)) {
            return "draw";
        } else if (playerTwoMove.equals(PAPER)) {
            return "paper";
        } else if (playerTwoMove.equals(SCISSORS) && playerOneMove.equals(PAPER)) {
            return "scissors";
        } else {
            return "rock";
        }
    }
}