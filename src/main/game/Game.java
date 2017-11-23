package main.game;

public class Game {
    private final English english;
    private final Greek greekLanguage;
    private Rules rules;
    private UI inputOutput;

    public Game(UI inputOutput, Rules rules, English englishLanguage, Greek greekLanguage) {
        this.inputOutput = inputOutput;
        this.rules = rules;
        this.english = englishLanguage;
        this.greekLanguage = greekLanguage;
    }

    public String getGameMode(Language language) {
        inputOutput.askUserForGameMode(language);
        return inputOutput.getGameMode();
    }

    public String getLanguageSelection() {
        inputOutput.askUserForLanguageSelection();
        return inputOutput.getLanguageSelection();
    }

    public void runGame(Language language, String gameMode) {
        Moves playerOneMove = getPlayerMove(language, language.playerOneType());
        Moves playerTwoMove = getPlayerTwoMove(language, gameMode);
        findWinner(playerOneMove, playerTwoMove, language);
    }

    public Moves getPlayerTwoMove(Language language, String gameMode) {
        if (gameMode.equals("1")) {
            return getPlayerMove(language, gameMode);
        } else {
            Moves computerMove = ComputerPlayer.playRandomMove();
            inputOutput.displayComputerMove(computerMove.getMove());
            return computerMove;
        }
    }

    private Moves getPlayerMove(Language language, String playerNumber) {
        inputOutput.askForMove(language, playerNumber);
        String playerMove = inputOutput.getMoveFromUser();
        return CommandLineUI.stringToEnum(playerMove);
    }

    public void findWinner(Moves playerOneMove, Moves playerTwoMove, Language language) {
        String winningMove = rules.scoreGame(playerOneMove, playerTwoMove);
        inputOutput.announceWinner(language, winningMove);
    }

    public Language selectLanguage(String userSelection) {
        if (userSelection.equals("1")) {
            return english;
        } else {
            return greekLanguage;
        }
    }

    public String convertToEnglish(String greekMove) {
       return "rock";
    }
}