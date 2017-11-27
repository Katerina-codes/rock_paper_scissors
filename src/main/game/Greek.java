package main.game;

import java.util.HashMap;

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
        return (String.format("%s κερδίζει 🙌 ", winningMove));
    }

    public String convertToGreek(String greekMove) {
        HashMap<String, String> englishToGreek = new HashMap<>();
        englishToGreek.put("rock", "πέτρα");
        englishToGreek.put("paper", "χαρτί");
        englishToGreek.put("scissors", "ψαλίδι");
        englishToGreek.put("draw", "είαι ισοπαλί 😅");
        return englishToGreek.get(greekMove);
    }
}
