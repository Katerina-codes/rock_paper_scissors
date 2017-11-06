package main.game;

public class Game {
    private UI inputOutput;

    public Game(UI inputOutput) { this.inputOutput = inputOutput; }

    public void runGame() {
        inputOutput.askForMove();
        inputOutput.getMoveFromUser();
    }
}
