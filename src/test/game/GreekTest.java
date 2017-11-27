package test.game;

import main.game.Greek;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreekTest {

    private Greek greekLanguage;

    @Before
    public void setUp() {
        greekLanguage = new Greek();
    }

    @Test
    public void promptForPlayerOne() {
        assertEquals("παίκτης ένα", greekLanguage.playerOneType());
    }

    @Test
    public void promptForPlayerTwo() {
        assertEquals("παίκτης δύο", greekLanguage.playerTwoType());
    }

    @Test
    public void promptForGameMode() {
        assertEquals("Εισαγάγετε '1' για Ανθkρώπινα εναντίον Ανθρώπου\nΕισαγάγετε '2' για Ανθρώπινο εναντίον υπολογιστή", greekLanguage.promptMode());
    }

    @Test
    public void promptForMove() {
        assertEquals("παίκτης ένα επιλέξτε την κίνηση σας πληκτρολογώντας 'πέτρα' 💎, 'χαρτί' 📰 ή 'ψαλίδι' 💇: ", greekLanguage.promptMove("παίκτης ένα"));
    }

    @Test
    public void announceDraw() {
        assertEquals("είαι ισοπαλί 😅", greekLanguage.announceDraw());
    }

    @Test
    public void announceWinner() {
        assertEquals("παίκτης ένα κερδίζει 🙌 ", greekLanguage.announceWin("παίκτης ένα"));
    }

    @Test
    public void convertDrawWhenLanguageisGreek() {
        assertEquals("είαι ισοπαλί 😅", greekLanguage.convertToGreek( "draw"));
    }

}
