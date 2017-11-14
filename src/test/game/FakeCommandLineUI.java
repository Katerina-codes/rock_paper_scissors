package test.game;

import main.game.UI;

public class FakeCommandLineUI implements UI {

    private boolean askForMoveWasCalled = false;
    private boolean getMoveFromUserWasCalled = false;
    private String announceWinnerWasCalled = null;
    private boolean askUserForGameModeWasCalled = false;
    private String getGameModeWasCalled = null;

    @Override
    public void askUserForGameMode() {
        this.askUserForGameModeWasCalled = true;
    }

    @Override
    public String getGameMode() {
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

    public boolean getGameModeWasCalled() {
        return getGameModeWasCalled != null;
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