package main.game;

public class Rock implements Score {

    @Override
    public String findScoreForMove(String playerTwoMove) {
        if (playerTwoMove.equals("paper")) {
            return "paper";
        } else {
            return "rock";
        }
    }
}
