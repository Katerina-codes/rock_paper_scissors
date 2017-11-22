package test.game;

import main.game.English;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnglishTest {

    @Test
    public void playerOneType() {
        English english = new English();

        assertEquals("Player one", english.playerOneType());
    }

    @Test
    public void playerTwoType() {
        English english = new English();

        assertEquals("Player two", english.playerTwoType());
    }

    @Test
    public void promptForGameMode() {
        English english = new English();

        assertEquals("Enter '1' for Human vs. Human\nEnter '2' for Human vs. Computer", english.promptMode());
    }

    @Test
    public void promptMove() {
        English english = new English();

        assertEquals("Player one pick your move by typing 'rock' 💎, 'paper' 📰 or 'scissors' 💇 : ", english.promptMove("Player one"));
    }

    @Test
    public void announceDraw() {
        English english = new English();

        assertEquals("It's a draw! 😅", english.announceDraw());
    }

    @Test
    public void announceWinner() {
        English english = new English();

        assertEquals("rock wins! 🙌 ", english.announceWin("rock"));
    }
}
