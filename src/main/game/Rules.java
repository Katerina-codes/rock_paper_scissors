package main.game;

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

        if (playerOneMove.equals(playerTwoMove)) {
            return "draw";
        } else if (playerOneMove.equals("rock")) {
            return rockMove.findScoreForMove(playerTwoMove);
        } else if (playerOneMove.equals("paper")) {
            return paperMove.findScoreForMove(playerTwoMove);
        } else {
            return scissorsMove.findScoreForMove(playerTwoMove);
        }
    }
}