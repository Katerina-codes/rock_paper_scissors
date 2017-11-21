package main.game;

import java.util.Random;

import static main.game.Moves.*;

public class ComputerPlayer {

    public static Moves playRandomMove() {
        Moves[] moves = new Moves[]{ROCK, PAPER, SCISSORS};

        Random random = new Random();
        int randomMove = random.nextInt(moves.length);
        return moves[randomMove];
    }
}
