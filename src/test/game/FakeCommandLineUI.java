package test.game;

import main.game.UI;

public class FakeCommandLineUI implements UI {


    private boolean askForMoveWasCalled = false;
    private boolean getMoveFromUserWasCalled = false;

    @Override
    public String askForMove() {
        this.askForMoveWasCalled = true;
        return "Pick your move by typing 'rock', 'paper' or 'scissors': ";
    }

    @Override
    public String getMoveFromUser() {
        this.getMoveFromUserWasCalled = true;
        return null;
    }

    public boolean askForMoveWasCalled() {
        return askForMoveWasCalled;
    }

    public boolean getMoveFromUserWasCalled() {
        return getMoveFromUserWasCalled;
    }
}