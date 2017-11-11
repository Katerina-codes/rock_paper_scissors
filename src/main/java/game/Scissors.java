package game;

public class Scissors implements Move {

    @Override
    public String scoreAgainst(String playerTwoMove) {
        if (playerTwoMove.equals("rock")) {
            return "rock";
        } else {
            return "scissors";
        }
    }
}
