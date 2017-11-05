package main.game;

public class Rules {
    public String scoreGame(String playerOneMove, String playerTwoMove) {

        if (playerOneMove.equals(playerTwoMove)) {
            return "draw";
        } else if (playerOneMove.equals("rock")) {
            return findScoreForRock(playerTwoMove);
        } else if (playerOneMove.equals("paper") && playerTwoMove.equals("scissors")) {
            return "scissors";
        } else if (playerOneMove.equals("scissors") && playerTwoMove.equals("rock")) {
            return "rock";
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

}