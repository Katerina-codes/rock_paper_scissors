package main.game;

public class LanguageFactory {

    public Language getLanguage(String languageDesired) {
        if (languageDesired.equals("English")) {
            return new English();
        } else {
            return new Greek();
        }
    }
}
