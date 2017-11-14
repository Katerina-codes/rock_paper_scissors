package main.game;

public enum Moves {
    ROCK("rock"),
    PAPER("paper"),
    SCISSORS("scissors");

    private final String move;

    Moves(String move) {
        this.move = move;
    }

    public String getMove() {
        return move;
    }
}
