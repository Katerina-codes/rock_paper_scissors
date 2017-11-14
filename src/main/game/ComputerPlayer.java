package main.game;

import java.util.Random;

public class ComputerPlayer {

    public static String playRandomMove() {
        String[] moves = new String[]{"rock", "paper", "scissors"};

        Random random = new Random();
        int randomMove = random.nextInt(moves.length);
        return moves[randomMove];
    }
}
