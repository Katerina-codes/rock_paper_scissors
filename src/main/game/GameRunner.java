package main.game;

public class GameRunner {
    public static void main(String[] args) {
        English english = new English();
        CommandLineUI inputOutput = new CommandLineUI(System.out, System.in, english);
        Rock rockMove = new Rock();
        Paper paperMove = new Paper();
        Scissors scissorsMove = new Scissors();
        Rules rules = new Rules(rockMove, paperMove, scissorsMove);
        Language language = new English();
        Game newGame = new Game(inputOutput, rules, language);
        newGame.runGame();
    }
}
