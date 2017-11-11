package main.game;

public class Paper implements Move {

    @Override
    public String scoreAgainst(String playerTwoMove) {
        if (playerTwoMove.equals("scissors")) {
            return "scissors";
        } else {
            return "paper";
        }
    }
}
