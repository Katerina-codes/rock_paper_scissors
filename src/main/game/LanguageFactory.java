package main.game;

public class LanguageFactory {
    private final Greek greek;
    public English english;

    public LanguageFactory() {
        english = new English();
        greek = new Greek();
    }

    public Language getLanguage(String languageDesired) {
        if (languageDesired.equals("English")) {
            return english;
        } else {
            return greek;
        }
    }
}
