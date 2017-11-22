package test.game;

import main.game.UI;

public class FakeCommandLineUI implements UI {

    private boolean askForMoveWasCalled = false;
    private boolean getMoveFromUserWasCalled = false;
    private String announceWinnerWasCalled = null;
    private boolean askUserForGameModeWasCalled = false;
    private boolean getGameModeWasCalled = false;
    private boolean displayComputerMoveWasCalled = false;
    private boolean askUserForLanguageTypeWasCalled = false;

    @Override
    public void askUserForLanguageType() {
        this.askUserForLanguageTypeWasCalled = true;
    }

    @Override
    public void askUserForGameMode() {
        this.askUserForGameModeWasCalled = true;
    }

    @Override
    public String getGameMode() {
        this.getGameModeWasCalled = true;
        return "1";
    }

    @Override
    public void askForMove(String player) {
        this.askForMoveWasCalled = true;
    }

    @Override
    public String getMoveFromUser() {
        this.getMoveFromUserWasCalled = true;
        return "rock";
    }

    @Override
    public void announceWinner(String winningMove) {
        this.announceWinnerWasCalled = winningMove;
    }

    @Override
    public void displayComputerMove(String playerTwoMove) {
        this.displayComputerMoveWasCalled = true;
    }

    public boolean displayComputerMoveWasCalled() {
        return displayComputerMoveWasCalled;
    }

    public boolean askUserForLanguageTypeWasCalled() {
        return askUserForLanguageTypeWasCalled;
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
}