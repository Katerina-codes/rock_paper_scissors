package main.game;

public interface UI {
    public String askForMove();
    public String getMoveFromUser();
    boolean askForMoveWasCalled();
}
