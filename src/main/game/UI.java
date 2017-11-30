package main.game;

public interface UI {
    public void askUserForLanguageSelection();
    public Language getLanguage();
    public void askUserForGameMode(Language language);
    public String getGameMode();
    public void askForMove(Language player, String language);
    public String getMoveFromUser(Language language);
    public void announceWinner(Language language, String winningMove);
    public void displayComputerMove(String playerTwoMove);
    public boolean modeIsHumanVsHuman(String gameMode);
}
