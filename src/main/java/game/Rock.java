package game;

public class Rock implements Move {

    @Override
    public String scoreAgainst(String playerTwoMove) {
        if (playerTwoMove.equals("paper")) {
            return "paper";
        } else {
            return "rock";
        }
    }
}
