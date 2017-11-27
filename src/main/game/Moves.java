package main.game;

import java.util.Random;

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

    public static Moves getRandomMove() {
        Moves[] moves = Moves.values();
        Random random = new Random();
        int randomMove = random.nextInt(moves.length);
        return moves[randomMove];
    }

}
