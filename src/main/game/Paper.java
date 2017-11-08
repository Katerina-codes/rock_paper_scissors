package main.game;

public class Paper implements Score {

    @Override
    public String findScoreForMove(String playerTwoMove) {
        if (playerTwoMove.equals("scissors")) {
            return "scissors";
        } else {
            return "paper";
        }
    }
}
