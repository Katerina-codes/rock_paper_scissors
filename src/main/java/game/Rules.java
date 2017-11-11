package game;

import java.util.HashMap;

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
}
