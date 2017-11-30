package main.game;

import javax.xml.transform.TransformerException;
import java.io.*;
import java.util.HashMap;

import static main.game.Moves.*;

public class CommandLineUI implements UI {
    public static final String ENGLISH = "1";
    public static final String HUMAN_VS_HUMAN = "1";
    private final PrintStream output;
    private final BufferedReader input;

    public CommandLineUI(PrintStream output, InputStream input) {
        this.output = output;
        this.input = new BufferedReader(new InputStreamReader(input));
    }

    public void askUserForLanguageSelection() {
        output.println("Select your language:\nEnter '" + ENGLISH + "' for English\nΕισαγάγετε '2' για τα Ελληνικά");
    }

    public Language getLanguage() {
        askUserForLanguageSelection();
        try {
            String languageChoice = input.readLine();
            if (languageChoice.equals(ENGLISH)) {
                return new English();
            } else {
                return new Greek();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void askUserForGameMode(Language language) {
        output.println(language.promptMode());
    }

    public boolean modeIsHumanVsHuman(String gameMode) {
        return gameMode.equals(HUMAN_VS_HUMAN);
    }

    public void askForMove(Language language, String player) {
        output.println(language.promptMove(player));
    }

    public String getMoveFromUser(Language languageChoice) {
        String move = "";
        try {
            move = input.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (languageChoice instanceof Greek) {
           return English.convertToEnglish(move);
        } else if (languageChoice instanceof English) {
            return move;
        } else {
            return move;
        }
    }

    public static Moves stringToEnum(String playerMove) {
        HashMap<String, Moves> moves = new HashMap<>();
        moves.put("rock", ROCK);
        moves.put("paper", PAPER);
        moves.put("scissors", SCISSORS);

        return moves.get(playerMove);
    }

    public void announceWinner(Language language, String winningMove) {
        if (winningMove.equals("draw")) {
            output.println(language.announceDraw());
        } else {
            output.println(language.announceWin(winningMove));
        }
    }

    public String getGameMode() {
        String gameMode = null;
        try {
            gameMode = input.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return gameMode;
    }

    public void displayComputerMove(String computerMove) {
        output.println(computerMove);
    }
}