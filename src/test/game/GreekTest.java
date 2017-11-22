package test.game;

import main.game.Greek;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreekTest {

    @Test
    public void promptForPlayerOne() {
        Greek greek = new Greek();

        assertEquals("παίκτης ένα", greek.playerOneType());
    }

    @Test
    public void promptForPlayerTwo() {
        Greek greek = new Greek();

        assertEquals("παίκτης δύο", greek.playerTwoType());
    }

    @Test
    public void promptForGameMode() {
        Greek greek = new Greek();

        assertEquals("Εισαγάγετε '1' για Ανθkρώπινα εναντίον Ανθρώπου\nΕισαγάγετε '2' για Ανθρώπινο εναντίον υπολογιστή", greek.promptMode());
    }

    @Test
    public void promptForMove() {
        Greek greek = new Greek();

        assertEquals("παίκτης ένα επιλέξτε την κίνηση σας πληκτρολογώντας 'πέτρα' 💎, 'χαρτί' 📰 ή 'ψαλίδι' 💇: ", greek.promptMove("παίκτης ένα"));
    }

    @Test
    public void announceDraw() {
        Greek greek = new Greek();

        assertEquals("είαι ισοπαλί 😅", greek.announceDraw());
    }

    @Test
    public void announceWinner() {
        Greek greek = new Greek();

        assertEquals("παίκτης ένα κερδίζει 🙌 ", greek.announceWin("παίκτης ένα"));
    }
}
