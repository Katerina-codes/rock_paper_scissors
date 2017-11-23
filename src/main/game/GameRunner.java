package main.game;

public class GameRunner {
    public static void main(String[] args) {
        CommandLineUI inputOutput = new CommandLineUI(System.out, System.in);
        Rock rockMove = new Rock();
        Paper paperMove = new Paper();
        Scissors scissorsMove = new Scissors();
        Rules rules = new Rules(rockMove, paperMove, scissorsMove);
        English englishLanguage = new English();
        Greek greekLanguage = new Greek();
        Game newGame = new Game(inputOutput, rules, englishLanguage, greekLanguage);
        String languageChoice = newGame.getLanguageSelection();
        Language language = newGame.selectLanguage(languageChoice);
        String gameMode = newGame.getGameMode(language);
        newGame.runGame(language, gameMode);
    }
}
