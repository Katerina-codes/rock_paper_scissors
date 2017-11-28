package test.game;

import main.game.English;
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
}
