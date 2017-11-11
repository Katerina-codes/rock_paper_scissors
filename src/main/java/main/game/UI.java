package main.game;

public interface UI {
    public void askForMove(String player);
    public String getMoveFromUser();
    public void announceWinner(String winningMove);
}
