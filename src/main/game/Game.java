package main.game;

public class Game {
    private Rules rules;
    private UI inputOutput;

    public Game(UI inputOutput, Rules rules) {
        this.inputOutput = inputOutput;
        this.rules = rules;
    }

    public void runGame() {
        inputOutput.askForMove("Player one");
        String playerOneMove = inputOutput.getMoveFromUser();
        inputOutput.askForMove("Player two");
        String playerTwoMove = inputOutput.getMoveFromUser();
        String winningMove = rules.scoreGame(playerOneMove, playerTwoMove);
        inputOutput.announceWinner(winningMove);
    }
}
