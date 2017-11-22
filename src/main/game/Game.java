package main.game;

public class Game {
    private final Language language;
    private Rules rules;
    private UI inputOutput;

    public Game(UI inputOutput, Rules rules, Language language) {
        this.inputOutput = inputOutput;
        this.rules = rules;
        this.language = language;
    }

    public void runGame() {
        inputOutput.askUserForGameMode();
        String gameMode = inputOutput.getGameMode();
        inputOutput.askUserForLanguageType();

        if (gameMode.equals("1")) {
            Moves playerOneMove = getPlayerMove(language.playerOneType());
            Moves playerTwoMove = getPlayerMove(language.playerTwoType());
            findWinner(playerOneMove, playerTwoMove);
        } else {
            Moves playerOneMove = getPlayerMove(language.playerOneType());
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

