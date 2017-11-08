package main.game;

public class Rules {
    private Rock rockMove;
    private Paper paperMove;

    public Rules(Rock rockMove, Paper paperMove) {
        this.rockMove = rockMove;
        this.paperMove = paperMove;
    }


    public String scoreGame(String playerOneMove, String playerTwoMove) {

        if (playerOneMove.equals(playerTwoMove)) {
            return "draw";
        } else if (playerOneMove.equals("rock")) {
            return rockMove.findScoreForMove(playerTwoMove);
        } else if (playerOneMove.equals("paper")) {
            return paperMove.findScoreForMove(playerTwoMove);
        } else {
            return findScoreForScissors(playerTwoMove);
        }
    }

    public String findScoreForScissors(String playerTwoMove) {
        if (playerTwoMove.equals("rock")) {
            return "rock";
        } else {
            return "scissors";
        }
    }

}