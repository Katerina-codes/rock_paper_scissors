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
        return (String.format("%s επιλέξτε την κίνηση σας πληκτρολογώντας 'πέτρα' 💎, 'χαρτί' 📰 ή 'ψαλίδι' 💇: ", player));
    }

    public String announceDraw() {
        return "είαι ισοπαλί 😅";
    }

    public String announceWin(String winningMove) {
        return null;
    }
}
