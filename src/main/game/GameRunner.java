package main.game;

public class GameRunner {
    public static void main(String[] args) {
        CommandLineUI inputOutput = new CommandLineUI(System.out, System.in);
        Rules rules = new Rules();
        Game newGame = new Game(inputOutput, rules);
        newGame.runGame();
    }
}
