package main.game;

public class Game {
    private Rules rules;
    private UI inputOutput;

    public Game(UI inputOutput, Rules rules) {
        this.inputOutput = inputOutput;
        this.rules = rules;
    }

    public void runGame() {
        inputOutput.askUserForGameMode();
        String gameMode = inputOutput.getGameMode();

        if (gameMode.equals("1")) {
            Moves playerOneMove = getPlayerMove("Player one");
            Moves playerTwoMove = getPlayerMove("Player two");
            findWinner(playerOneMove, playerTwoMove);
        } else {
            Moves playerOneMove = getPlayerMove("Player one");
            Moves playerTwoMove = ComputerPlayer.playRandomMove();
            inputOutput.displayComputerMove(playerTwoMove.getMove());
            findWinner(playerOneMove, playerTwoMove);
        }
    }

    private Moves getPlayerMove(String player) {
        inputOutput.askForMove(player);
        String playerMove = inputOutput.getMoveFromUser();
        return CommandLineUI.stringToEnum(playerMove);
    }

    public void findWinner(Moves playerOneMove, Moves playerTwoMove) {
        String winningMove = rules.scoreGame(playerOneMove, playerTwoMove);
        inputOutput.announceWinner(winningMove);
    }
}

