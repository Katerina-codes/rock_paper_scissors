package main.game;

public class Game {
    private final English englishLanguage;
    private final Greek greekLanguage;
    private Rules rules;
    private UI inputOutput;

    public Game(UI inputOutput, Rules rules, English englishLanguage, Greek greekLanguage) {
        this.inputOutput = inputOutput;
        this.rules = rules;
        this.englishLanguage = englishLanguage;
        this.greekLanguage = greekLanguage;
    }

    public String getGameMode(Language language) {
        inputOutput.askUserForGameMode(language);
        return inputOutput.getGameMode();
    }

    public Language getLanguageSelection() {
        inputOutput.askUserForLanguageSelection();
        String userChoice = inputOutput.getLanguageSelection();
        return selectLanguage(userChoice);
    }

    public void runGame(Language language, String gameMode) {
        Moves playerOneMove = getPlayerMove(language, language.playerOneType(), gameMode);
        Moves playerTwoMove = getPlayerTwoMove(language, gameMode);
        findWinner(playerOneMove, playerTwoMove, language);
    }

    public Moves getPlayerTwoMove(Language language, String gameMode) {
        if (gameMode.equals("1")) {
            return getPlayerMove(language, gameMode, gameMode);
        } else {
            return ComputerPlayer.playRandomMove();
            }
        }

    private Moves getPlayerMove(Language language, String playerNumber, String gameMode) {
        inputOutput.askForMove(language, playerNumber);
        String playerMove = inputOutput.getMoveFromUser(gameMode);
        return CommandLineUI.stringToEnum(playerMove);
    }

    public void findWinner(Moves playerOneMove, Moves playerTwoMove, Language language) {
        String winningMove = rules.scoreGame(playerOneMove, playerTwoMove);
           inputOutput.announceWinner(language, winningMove);
    }

    public Language selectLanguage(String userSelection) {
        if (userSelection.equals("1")) {
            return englishLanguage;
        } else {
            return greekLanguage;
        }
    }
}