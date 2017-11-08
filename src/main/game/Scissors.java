package main.game;

public class Scissors implements Score {

    @Override
    public String findScoreForMove(String playerTwoMove) {
        if (playerTwoMove.equals("rock")) {
            return "rock";
        } else {
            return "scissors";
        }
    }
}
