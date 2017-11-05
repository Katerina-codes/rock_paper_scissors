package main.game;

public class Rules {
    public String scoreGame(String playerOneMove, String playerTwoMove) {
        if (playerOneMove.equals(playerTwoMove)) {
            return "draw";
        } else if (playerOneMove.equals("rock") && playerTwoMove.equals("paper")) {
            return "paper";
        } else if (playerOneMove.equals("paper") && playerTwoMove.equals("scissors")) {
            return "scissors";
        } else {
            return playerOneMove;
        }
    }
}