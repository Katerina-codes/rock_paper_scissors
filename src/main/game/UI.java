package main.game;

public interface UI {
    public void askUserForLanguageSelection();
    public String getLanguageSelection();
    public void askUserForGameMode(Language language);
    public String getGameMode();
    public void askForMove(Language player, String language);
    public String getMoveFromUser(String gameMode);
    public void announceWinner(Language language, String winningMove);
    public void displayComputerMove(String playerTwoMove);
}
