package main.game;

public class Greek implements Language {

    public String playerOneType() {
        return "παίκτης ένα";
    }

    public String playerTwoType() {
        return "παίκτης δύο";
    }

    public String promptMode() {
        return "Εισαγάγετε '1' για Ανθkρώπινα εναντίον Ανθρώπου\nΕισαγάγετε '2' για Ανθρώπινο εναντίον υπολογιστή";
    }

    public String promptMove(String player) {
        return null;
    }

    public String announceDraw() {
        return null;
    }

    public String announceWin(String winningMove) {
        return null;
    }
}
