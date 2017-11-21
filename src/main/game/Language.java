package main.game;

public interface Language {
    public String playerOneType();
    public String playerTwoType();
    public String promptMode();
    public String promptMove(String player);
    public String announceDraw();
    public String announceWin(String winningMove);
}
