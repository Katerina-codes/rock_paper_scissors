package main.game;

public class Rules {
    public String scoreGame(String playerOneMove, String playerTwoMove) {
        if (playerOneMove.equals(playerTwoMove)) {
            return "draw";
        } else if (playerTwoMove.equals("paper")) {
            return "paper";
        } else {
            return playerOneMove;
        }
    }
}