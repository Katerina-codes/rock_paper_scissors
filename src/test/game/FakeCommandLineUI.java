package test.game;

import main.game.UI;

public class FakeCommandLineUI implements UI {

    private boolean askForMoveWasCalled = false;
    private boolean getMoveFromUserWasCalled = false;
    private boolean announceWinnerWasCalled = false;

    @Override
    public void askForMove() {
        this.askForMoveWasCalled = true;
    }

    @Override
    public String getMoveFromUser() {
        this.getMoveFromUserWasCalled = true;
        return "rock";
    }

    @Override
    public void announceWinner(String winningMove) {
        this.announceWinnerWasCalled = true;
    }

    public boolean askForMoveWasCalled() {
        return askForMoveWasCalled;
    }

    public boolean getMoveFromUserWasCalled() {
        return getMoveFromUserWasCalled;
    }

    public boolean announceWinnerWasCalled() {
        return announceWinnerWasCalled;
    }
}