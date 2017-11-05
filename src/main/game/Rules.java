package main.game;

public class Rules {
    public String scoreGame(String playerOneMove, String playerTwoMove) {

        if (playerOneMove.equals(playerTwoMove)) {
            return "draw";
        } else if (playerOneMove.equals("rock")) {
            return findScoreForRock(playerTwoMove);
        } else if (playerOneMove.equals("paper")) {
            return findScoreForPaper(playerTwoMove);
        } else if (playerOneMove.equals("scissors")) {
            return findScoreForScissors(playerTwoMove);
        } else {
            return playerOneMove;
        }
    }

    public String findScoreForRock(String playerTwoMove) {
        if (playerTwoMove.equals("paper")) {
            return "paper";
        } else {
            return "rock";
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