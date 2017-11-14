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
            inputOutput.askForMove("Player one");
            String playerOneMove = inputOutput.getMoveFromUser();
            inputOutput.askForMove("Player two");
            String playerTwoMove = inputOutput.getMoveFromUser();
            Moves convertedPlayerOneMove = CommandLineUI.stringToEnum(playerOneMove);
            Moves convertedPlayerTwoMove = CommandLineUI.stringToEnum(playerTwoMove);
            String winningMove = rules.scoreGame(convertedPlayerOneMove, convertedPlayerTwoMove);
            inputOutput.announceWinner(winningMove);
        } else {
            inputOutput.askForMove("Player one");
            String playerOneMove = inputOutput.getMoveFromUser();
            String playerTwoMove = ComputerPlayer.playRandomMove();
            Moves convertedPlayerOneMove = CommandLineUI.stringToEnum(playerOneMove);
            Moves convertedPlayerTwoMove = CommandLineUI.stringToEnum(playerTwoMove);
            String winningMove = rules.scoreGame(convertedPlayerOneMove, convertedPlayerTwoMove);
            inputOutput.announceWinner(winningMove);
        }
    }
}
