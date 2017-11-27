package test.game;

import main.game.English;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnglishTest {

    private English englishLanguage;

    @Before
    public void setUp() {
        englishLanguage = new English();
    }

    @Test
    public void playerOneType() {
        assertEquals("Player one", englishLanguage.playerOneType());
    }

    @Test
    public void playerTwoType() {
        assertEquals("Player two", englishLanguage.playerTwoType());
    }

    @Test
    public void promptForGameMode() {
        assertEquals("Enter '1' for Human vs. Human\nEnter '2' for Human vs. Computer", englishLanguage.promptMode());
    }

    @Test
    public void promptMove() {
        assertEquals("Player one pick your move by typing 'rock' 💎, 'paper' 📰 or 'scissors' 💇 : ", englishLanguage.promptMove("Player one"));
    }

    @Test
    public void announceDraw() {
        assertEquals("It's a draw! 😅", englishLanguage.announceDraw());
    }

    @Test
    public void announceWinner() {
        assertEquals("rock wins! 🙌 ", englishLanguage.announceWin("rock"));
    }

    @Test
    public void convertsRockMoveToEnglish() {
        assertEquals("rock", englishLanguage.convertToEnglish("πέτρα"));
    }

    @Test
    public void convertsPaperMoveToEnglish() {
        assertEquals("paper", englishLanguage.convertToEnglish("χαρτί"));
    }

    @Test
    public void convertsScissorsMoveToEnglish() {
        assertEquals("scissors", englishLanguage.convertToEnglish("ψαλίδι"));
    }
}
