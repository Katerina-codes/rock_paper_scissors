package main.game;

public class Game {
    private Language language;
    private Language englishLanguage;
    private Language greekLanguage;
    private Rules rules;
    private UI inputOutput;

    public Game(UI inputOutput, Rules rules, Language englishLanguage, Language greekLanguage) {
        this.inputOutput = inputOutput;
        this.rules = rules;
        this.englishLanguage = englishLanguage;
        this.greekLanguage = greekLanguage;
    }

    public Game(UI inputOutput, Rules rules, Language language) {
        this.inputOutput = inputOutput;
        this.rules = rules;
        this.language = language;
    }

    public String getGameMode(Language language) {
        inputOutput.askUserForGameMode(language);
        return inputOutput.getGameMode();
    }

    public Language getLanguageSelection() {
        return inputOutput.getLanguage();
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
}