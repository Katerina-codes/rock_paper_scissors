package main.game;

public class GameRunner {
    public static void main(String[] args) {
        CommandLineUI inputOutput = new CommandLineUI(System.out, System.in);
        Rock rockMove = new Rock();
        Rules rules = new Rules(rockMove);
        Game newGame = new Game(inputOutput, rules);
        newGame.runGame();
    }
}
