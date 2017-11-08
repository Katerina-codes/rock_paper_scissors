package main.game;

public class Rules {
    private Rock rockMove;

    public Rules(Rock rockMove) {
        this.rockMove = rockMove;
    }


    public String scoreGame(String playerOneMove, String playerTwoMove) {

        if (playerOneMove.equals(playerTwoMove)) {
            return "draw";
        } else if (playerOneMove.equals("rock")) {
            return rockMove.findScoreForMove(playerTwoMove);
        } else if (playerOneMove.equals("paper")) {
            return findScoreForPaper(playerTwoMove);
        } else {
            return findScoreForScissors(playerTwoMove);
        }
    }

    public String findScoreForPaper(String playerTwoMove) {
        if (playerTwoMove.equals("scissors")) {
            return "scissors";
        } else {
            return "paper";
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