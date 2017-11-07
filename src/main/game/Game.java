package main.game;

public class Game {
    private Rules rules;
    private UI inputOutput;

    public Game(UI inputOutput, Rules rules) {
        this.inputOutput = inputOutput;
        this.rules = rules;
    }

    public void runGame() {
        inputOutput.askForMove();
        String playerOneMove = inputOutput.getMoveFromUser();
        String playerTwoMove = inputOutput.getMoveFromUser();
        String winningMove = rules.scoreGame(playerOneMove, playerTwoMove);
        inputOutput.announceWinner(winningMove);
    }
}
