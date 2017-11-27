package main.game;

public class English implements Language {

    public String playerOneType() {
        return "Player one";
    }

    public String playerTwoType() {
        return "Player two";
    }

    public String promptMode() {
        return "Enter '1' for Human vs. Human\nEnter '2' for Human vs. Computer";
    }

    public String promptMove(String player) {
        return (String.format("%s pick your move by typing 'rock' 💎, 'paper' 📰 or 'scissors' 💇 : ", player));
    }

    public String announceDraw() {
        return "It's a draw! 😅";
    }

    public String announceWin(String winningMove) {
        return (String.format("%s wins! 🙌 ", winningMove));
    }
}
