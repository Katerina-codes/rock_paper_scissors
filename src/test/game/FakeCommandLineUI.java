package test.game;

import main.game.Language;
import main.game.UI;

public class FakeCommandLineUI implements UI {

    private boolean askForMoveWasCalled = false;
    private boolean getMoveFromUserWasCalled = false;
    private String announceWinnerWasCalled = null;
    private boolean askUserForGameModeWasCalled = false;
    private boolean getGameModeWasCalled = false;
    private boolean displayComputerMoveWasCalled = false;
    private boolean askUserForLanguageSelectionWasCalled = false;
    private boolean getLanguageWasCalled = false;
    private boolean modeIsHumanVsHumanWasCalled = true;

    @Override
    public void askUserForLanguageSelection() {
        this.askUserForLanguageSelectionWasCalled = true;
    }

    @Override
    public Language getLanguage() {
        this.getLanguageWasCalled = true;
        return null;
    }

    @Override
    public void askUserForGameMode(Language language) {
        this.askUserForGameModeWasCalled = true;
    }

    @Override
    public String getGameMode() {
        this.getGameModeWasCalled = true;
        return "1";
    }

    @Override
    public void askForMove(Language language, String player) {
        this.askForMoveWasCalled = true;
    }

    @Override
    public String getMoveFromUser(Language gameMode) {
        this.getMoveFromUserWasCalled = true;
        return "rock";
    }

    @Override
    public void announceWinner(Language language, String winningMove) {
        this.announceWinnerWasCalled = winningMove;
    }

    @Override
    public void displayComputerMove(String playerTwoMove) {
        this.displayComputerMoveWasCalled = true;
    }

    @Override
    public boolean modeIsHumanVsHuman(String gameMode) {
        this.modeIsHumanVsHumanWasCalled = true;
        return true;
    }

    public boolean modeIsHumanVsHumanWasCalled() {
        return modeIsHumanVsHumanWasCalled;
    }

    public boolean askUserForLanguageSelectionWasCalled() {
        return askUserForLanguageSelectionWasCalled;
    }

    public boolean displayComputerMoveWasCalled() {
        return displayComputerMoveWasCalled;
    }

    public boolean askUserForGameModeWasCalled() {
        return askUserForGameModeWasCalled;
    }

    public boolean getGameModeWasCalled() {
        return getGameModeWasCalled;
    }

    public String resultAnnouncedWas() {
        return this.announceWinnerWasCalled;
    }

    public boolean askForMoveWasCalled() {
        return askForMoveWasCalled;
    }

    public boolean getMoveFromUserWasCalled() {
        return getMoveFromUserWasCalled;
    }

    public boolean announceWinnerWasCalled() {
        return announceWinnerWasCalled != null;
    }

    public boolean getLanguageWasCalled() {
        return getLanguageWasCalled;
    }
}