package main.game;

public class LanguageFactory {
    public English english;

    public LanguageFactory() {
        english = new English();
    }

    public Language getLanguage(String languageDesired) {
            return english;
        }
    }
