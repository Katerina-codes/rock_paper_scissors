package main.game;

public interface UI {
    public void askForMove();
    public String getMoveFromUser();
    public void announceWinner(String winningMove);
}
