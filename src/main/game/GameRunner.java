package main.game;

public class GameRunner {
    public static void main(String[] args) {
        CommandLineUI inputOutput = new CommandLineUI(System.out, System.in);
        Rock rockMove = new Rock();
        Paper paperMove = new Paper();
        Scissors scissorsMove = new Scissors();
        Rules rules = new Rules(rockMove, paperMove, scissorsMove);
        Game newGame = new Game(inputOutput, rules);
        newGame.runGame();
    }
}
