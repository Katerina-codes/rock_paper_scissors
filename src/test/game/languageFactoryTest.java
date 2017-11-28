package test.game;

import main.game.English;
import main.game.Greek;
import main.game.Language;
import main.game.LanguageFactory;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class languageFactoryTest {

    @Test
    public void returnEnglishObjectForStringEnglish() {
        LanguageFactory languageFactory = new LanguageFactory();
        Language language = languageFactory.getLanguage("English");
        assertTrue(language instanceof English);
    }

    @Test
    public void returnGreekObjectForStringGreek() {
        LanguageFactory languageFactory = new LanguageFactory();
        Language language = languageFactory.getLanguage("Greek");
        assertTrue(language instanceof Greek);
    }
}
