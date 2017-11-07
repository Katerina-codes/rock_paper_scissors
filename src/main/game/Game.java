package main.game;

public class Game {
    private UI inputOutput;

    public Game(UI inputOutput) { this.inputOutput = inputOutput; }

    public void runGame() {
        inputOutput.askForMove();
        String playerOneMove = inputOutput.getMoveFromUser();
        inputOutput.announceWinner(playerOneMove);
    }
}
