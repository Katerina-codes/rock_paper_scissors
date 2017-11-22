package main.game;

public class Game {
    private final Language language;
    private final Greek greekLanguage;
    private Rules rules;
    private UI inputOutput;

    public Game(UI inputOutput, Rules rules, Language language, Greek greekLanguage) {
        this.inputOutput = inputOutput;
        this.rules = rules;
        this.language = language;
        this.greekLanguage = greekLanguage;
    }

    public String getGameMode() {
        inputOutput.askUserForGameMode();
        return inputOutput.getGameMode();
    }

    public void getLanguageSelection() {
        inputOutput.askUserForLanguageSelection();
        inputOutput.getLanguageSelection();
    }

    public void runGame(String gameMode) {
        Moves playerOneMove = getPlayerMove(language.playerOneType());
        Moves playerTwoMove = getPlayerTwoMove(gameMode);
        findWinner(playerOneMove, playerTwoMove);
    }

    public Moves getPlayerTwoMove(String gameMode) {
        if (gameMode.equals("1")) {
            return getPlayerMove(language.playerTwoType());
        } else {
            Moves computerMove = ComputerPlayer.playRandomMove();
            inputOutput.displayComputerMove(computerMove.getMove());
            return computerMove;
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

    public Language selectLanguage(String userSelection) {
        if (userSelection.equals("1")) {
            return language;
        } else {
            return greekLanguage;
        }
    }
}