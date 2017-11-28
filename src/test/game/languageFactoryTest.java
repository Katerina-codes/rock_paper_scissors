package test.game;

import main.game.English;
import main.game.LanguageFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class languageFactoryTest {

    @Test
    public void returnEnglishObjectForStringEnglish() {
        LanguageFactory languageFactory = new LanguageFactory();
        English english = new English();

        assertEquals(english, languageFactory.getLanguage("English"));
    }

}

