package main.game;

public class Rules {
    public String scoreGame(String playerOneMove, String playerTwoMove) {
        if (playerOneMove.equals(playerTwoMove)) {
            return "draw";
        } else {
            return "paper";
        }
    }
}